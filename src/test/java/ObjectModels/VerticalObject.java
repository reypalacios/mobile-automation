package ObjectModels;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class VerticalObject {

    Logger logger = Logger.getLogger(this.getClass());

    @iOSFindBy(xpath= "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[2]/UIATableCell[2]")
    public static WebElement home;
    @iOSFindBy(name = "Latest")
    public static WebElement latest;
    @iOSFindBy(name = "TECH")
    public static WebElement tech;
    @iOSFindBy(name = "Enterprise")
    public static WebElement enterprise;
    @iOSFindBy(name = "Science")
    public static WebElement science;
    @iOSFindBy(name = "FINANCE")
    public static WebElement finance;
    @iOSFindBy(name = "markets")
    public static WebElement markets;
    @iOSFindBy(name = "Your Money")
    public static WebElement YourMoney;
    @iOSFindBy(name = "Wealth Advisor")
    public static WebElement weathAdvisor;
    @iOSFindBy(name = "Politics")
    public static WebElement politics;
    @iOSFindBy(name = "Military & Defense")
    public static WebElement militarydefense;
    @iOSFindBy(name = "Law & Order")
    public static WebElement laworder;
    @iOSFindBy(name = "STRATEGY")
    public static WebElement strategy;
    @iOSFindBy(name = "Careers")
    public static WebElement Careers;
    @iOSFindBy(name = "Advertising")
    public static WebElement Advertising;
    @iOSFindBy(name = "Retail")
    public static WebElement Retail;
    @iOSFindBy(name = "Small Business")
    public static WebElement SmallBusiness;
    @iOSFindBy(name = "LIFE")
    public static WebElement life;
    @iOSFindBy(name = "Transportation")
    public static WebElement Transportation;
    @iOSFindBy(name = "Education")
    public static WebElement education;
    @iOSFindBy(name = "ENTERTAINMENT")
    public static WebElement entertainment;
    @iOSFindBy(name = "Sports")
    public static WebElement Sports;
    @iOSFindBy(name = "ABOUT BI")
    public static WebElement aboutbi;
    @iOSFindBy(name = "Legal Fine Print")
    public static WebElement legalfineprint;
    @iOSFindBy(name = "Send Feedback")
    public static WebElement SendFeedback;
    @iOSFindBy(name = "Settings")
    public static WebElement Settings;
    @iOSFindBy(name = "©2015 Business Insider, Inc. All rights reserved.  Use of this app constitutes acceptance of our  Terms of Service and Privacy Policy.")
    public static WebElement copyright;





    public VerticalObject(AppiumDriver<WebElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
    }

    public void Clickhome() {

        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        home.click();
        logger.info("Click home Vertical");


    }

    public void ClickLatest() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        latest.click();
        logger.info("Click Latest Vertical");


    }

    public void Clicktech() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        tech.click();
        logger.info("Click tech Vertical");
    }

    public void Clickenterprise() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        enterprise.click();
        logger.info("Click enterprise Vertical");
    }

    public void ClickScience() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        science.click();
        logger.info("Click Science Vertical");
    }

    public void Clickfinance() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();
        finance.click();
        logger.info("Click finance Vertical");
    }

    public void ClickYourMoney() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();


    YourMoney.click();

    logger.info("Click yourmoney Vertical");
    }

    public void ClickWealthAdvisor() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        weathAdvisor.click();
        logger.info("Click wealthadvisor Vertical");

    }

    public void Clickpolitics() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        politics.click();
        logger.info("Click politics Vertical");
    }

    public void Clickmilitarydefense() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

       militarydefense.click();
        logger.info("Click militarydefense Vertical");


    }

    public void Clicklaworder() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        laworder.click();
        logger.info("Click law order Vertical");

    }

    public void Clickstrategy() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        strategy.click();
        logger.info("Click strategy Vertical");

    }

    public void ClickCarrers() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Careers.click();
        logger.info("Click Careers Vertical");
    }

    public void ClickAdvertising() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Advertising.click();
        logger.info("Click Advertising vertical");

    }

    public void ClickRetail() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Retail.click();
        logger.info("Click Retail vertical");
    }

    public void ClickSmallBusiness() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        SmallBusiness.click();
        logger.info("Click Small Business vertical");
    }

    public void ClickLife() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        life.click();
        logger.info("Click life vertical");
    }

    public void ClickTransportation() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Transportation.click();
        logger.info("Click Transportation Vertical");
    }

    public void ClickEducation() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        education.click();
        logger.info("Click Education Vertical");
    }

    public void ClickEntertainment() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        entertainment.click();
        logger.info("Click Entertainment vertical");
    }

    public void ClickSports() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Sports.click();
        logger.info("click Sports vertical");
    }

    public void Clickaboutbi() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        aboutbi.click();
        logger.info("Click on about bi vertical");
    }

    public void Clicklegalfineprint() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        legalfineprint.click();
        logger.info("Click on Legal Fine Print vertical");
    }

    public void Clicksendfeedback() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        SendFeedback.click();
        logger.info("Click sendfeedback vertical");
    }

    public void Clicksettings() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        Settings.click();
        logger.info("Click Settings vertical");
    }

    public void Clickcopyright() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

       copyright.click();
        logger.info(" Click copyright ");
    }

    }
