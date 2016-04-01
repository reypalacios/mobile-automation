FROM ubuntu:12.04
#FROM businessinsider/u1204

###############################################
# Base config
###############################################
# Update apt repo before we begin
RUN apt-get update

# Install system packages
RUN apt-get -y install apt-utils
RUN apt-get -y install libterm-readline-gnu-perl libterm-readline-perl-perl python-software-properties git
RUN apt-get -y install make

# System up to date
RUN apt-get -y dist-upgrade
RUN apt-get autoremove
RUN apt-get autoclean
###############################################
# Custom config
# Oracle Java 1.8.0_11 64 bit
# Maven 3.2.2
# Jenkins 1.574
# git 1.9.1
# Nano 2.2.6-1ubuntu1
###############################################

# update dpkg repositories
#RUN apt-get update
# install wget
RUN apt-get install -y wget
# get maven 3.2.2
RUN wget --no-verbose -O /tmp/apache-maven-3.2.2.tar.gz http://archive.apache.org/dist/maven/maven-3/3.2.2/binaries/apache-maven-3.2.2-bin.tar.gz
# verify checksum
#RUN echo "87e5cc81bc4ab9b83986b3e77e6b3095 /tmp/apache-maven-3.2.2.tar.gz" | md5sum -c
# install maven
RUN tar xzf /tmp/apache-maven-3.2.2.tar.gz -C /opt/
RUN ln -s /opt/apache-maven-3.2.2 /opt/maven
RUN ln -s /opt/maven/bin/mvn /usr/local/bin
RUN rm -f /tmp/apache-maven-3.2.2.tar.gz
ENV MAVEN_HOME /opt/maven
# install git
RUN apt-get install -y git
# install nano
RUN apt-get install -y nano
# remove download archive files
RUN apt-get clean
# set shell variables for java installation
ENV java_version 1.8.0_11
ENV filename jdk-8u11-linux-x64.tar.gz
ENV downloadlink http://download.oracle.com/otn-pub/java/jdk/8u11-b12/$filename
# download java, accepting the license agreement
RUN wget --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" -O /tmp/$filename $downloadlink
# unpack java
RUN mkdir /opt/java-oracle && tar -zxf /tmp/$filename -C /opt/java-oracle/
ENV JAVA_HOME /opt/java-oracle/jdk$java_version
ENV PATH $JAVA_HOME/bin:$PATH
# configure symbolic links for the java and javac executables
RUN update-alternatives --install /usr/bin/java java $JAVA_HOME/bin/java 20000 && update-alternatives --install /usr/bin/javac javac $JAVA_HOME/bin/javac 20000
# copy jenkins war file to the container
ADD http://mirrors.jenkins-ci.org/war/latest/jenkins.war /opt/jenkins.war
RUN chmod 644 /opt/jenkins.war
ENV JENKINS_HOME /jenkins


# configure the container to run jenkins, mapping container port 8080 to that host port
ENTRYPOINT ["java", "-jar", "/opt/jenkins.war"]
EXPOSE 8080




# install Android SDK dependencies
RUN apt-get install -y openjdk-7-jre-headless lib32z1 lib32ncurses5 lib32bz2-1.0 g++-multilib
    
# Main Android SDK
RUN wget -qO- "http://dl.google.com/android/android-sdk_r23.0.2-linux.tgz" | tar -zxv -C /opt/
RUN echo y | /opt/android-sdk-linux/tools/android update sdk --all --filter platform-tools,build-tools-20.0.0 --no-ui --force

ENV ANDROID_HOME /opt/android-sdk-linux

RUN apt-get -y install software-properties-common
RUN add-apt-repository ppa:chris-lea/node.js
RUN apt-get update

RUN mkdir /opt/appium
RUN useradd -m -s /bin/bash appium
RUN chown -R appium:appium /opt/appium

USER appium
ENV HOME /home/appium

RUN cd /opt/appium && npm install appium 

EXPOSE 4723
#CMD /opt/appium/node_modules/appium/bin/appium.js
CMD [""]

