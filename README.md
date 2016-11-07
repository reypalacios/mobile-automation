#mobile-automation
=================

AFTs for BI, BII production and Dev environments

##Local Docker Setup

These tests can be run as they do on triggered deploys on your localdocker VM via Vagrant.  This guide assumes you have already setup the [TBI](https://github.com/businessinsider/tbi) code base, with its setup requirements [Vagrant Local Environment](https://businessinsider.atlassian.net/wiki/display/BI/Vagrant+Local+Environment)

The architecture consists of a docker-compose file which creates containers, a `selenium-grid` and `selenium-browser-node`, (firefox and chrome) which act as a small grid for tests to run on. 

### Sync
Sync `mobile-automation` source dir to your VM by adding it as a sync folder to your `Vagrantfile`

# Example Mounts

`config.vm.synced_folder "~/path/to/your/repo/for/mobile-automation", "/containers/code/mobile-automation"`

### Build

SSH into your VM and `cd /containers/code/mobile-automation/docker`

Here you should see all of the `fig` files per environment which you can then build. Following these steps for any of the fig files will run the tests on the env specified, and have the docker containers `build`, `up`, `kill` processes, and `rm` the leftover containers.

`sudo docker-compose -f local-hub.yml up -d`

