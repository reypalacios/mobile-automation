package objectModels;

import appium.MobileException;
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

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[@text='FAVORITES']")
    public static WebElement favorites;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='HOME']")
    @iOSFindBy(xpath= "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[2]/UIATableCell[2]")
    public static WebElement home;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Latest']")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.TextView[@text='Latest']")
    @iOSFindBy(name = "Latest")
    public static WebElement latest;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[4]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='TECH']")
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='TECH']")
    @iOSFindBy(name = "TECH")
    public static WebElement tech;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[5]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Enterprise']")
    @iOSFindBy(name = "Enterprise")
    public static WebElement enterprise;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[6]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Science']")
    @iOSFindBy(name = "Science")
    public static WebElement science;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[7]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='FINANCE']")
    @iOSFindBy(name = "FINANCE")
    public static WebElement finance;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[8]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Markets']")
    @iOSFindBy(name = "markets")
    public static WebElement markets;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[9]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Your Money']")
    @iOSFindBy(name = "Your Money")
    public static WebElement YourMoney;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[10]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Wealth Advisor']")
    @iOSFindBy(name = "Wealth Advisor")
    public static WebElement weathAdvisor;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[11]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='POLITICS']")
    @iOSFindBy(name = "Politics")
    public static WebElement politics;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[12]/android.widget.FrameLayout[1]//android.widget.TextView[@text='Military & Defense']")
    @iOSFindBy(name = "Military & Defense")
    public static WebElement militarydefense;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[13]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Law & Order']")
    @iOSFindBy(name = "Law & Order")
    public static WebElement laworder;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[14]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='STRATEGY']")
    @iOSFindBy(name = "STRATEGY")
    public static WebElement strategy;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[15]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Careers']")
    @iOSFindBy(name = "Careers")
    public static WebElement Careers;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[16]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Advertising']")
    @iOSFindBy(name = "Advertising")
    public static WebElement Advertising;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[17]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Retail']")
    @iOSFindBy(name = "Retail")
    public static WebElement Retail;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[18]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Small Business']")
    @iOSFindBy(name = "Small Business")
    public static WebElement SmallBusiness;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[19]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='LIFE']")
    @iOSFindBy(name = "LIFE")
    public static WebElement life;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[20]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Transportation']")
                            //android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[17]/android.widget.FrameLayout[1]/
    @iOSFindBy(name = "Transportation")
    public static WebElement Transportation;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[21]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Education']")
    @iOSFindBy(name = "Education")
    public static WebElement education;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[22]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Entertainment']")
    @iOSFindBy(name = "ENTERTAINMENT")
    public static WebElement entertainment;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[23]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Sports']")
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

    @AndroidFindBy(id = "android:id/action_bar_title")
    public static WebElement currentVertical;

    public VerticalObject(AppiumDriver<WebElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
    }

    public void clickFavorites() {
        favorites.click();
        logger.info("Click Favorites");
    }

    public void clickhome() {
        home.click();
        logger.info("click home Vertical");
    }

    public void clickLatest() {
        latest.click();
        logger.info("click Latest Vertical");
    }

    public void clicktech() {
        tech.click();
        logger.info("click tech Vertical");
    }

    public void clickenterprise() {
        enterprise.click();
        logger.info("click enterprise Vertical");
    }

    public void clickScience() {
        science.click();
        logger.info("click Science Vertical");
    }

    public void clickfinance() {
        finance.click();
        logger.info("click finance Vertical");
    }

    public void clickMarkets() {
        markets.click();
        logger.info("click markets Vertical");
    }

    public void clickYourMoney() {
        YourMoney.click();
        logger.info("click yourmoney Vertical");
    }

    public void clickWealthAdvisor() {
        weathAdvisor.click();
        logger.info("click wealthadvisor Vertical");
    }

    public void clickpolitics() {
        politics.click();
        logger.info("click politics Vertical");
    }

    public void clickmilitarydefense() {
        militarydefense.click();
        logger.info("click militarydefense Vertical");
    }

    public void clicklaworder() {
        laworder.click();
        logger.info("click law order Vertical");
    }

    public void clickstrategy() {
        strategy.click();
        logger.info("click strategy Vertical");
    }

    public void clickCarrers() {
        Careers.click();
        logger.info("click Careers Vertical");
    }

    public void clickAdvertising() {
        Advertising.click();
        logger.info("click Advertising vertical");
    }

    public void clickRetail() {
        Retail.click();
        logger.info("click Retail vertical");
    }

    public void clickSmallBusiness() {
        SmallBusiness.click();
        logger.info("click Small Business vertical");
    }

    public void clickLife() {
        life.click();
        logger.info("click life vertical");
    }

    public void clickTransportation() {
        Transportation.click();
        logger.info("click Transportation Vertical");
    }

    public void clickEducation() {
        education.click();
        logger.info("click Education Vertical");
    }

    public void clickEntertainment() {
        entertainment.click();
        logger.info("click Entertainment vertical");
    }

    public void clickSports() {
        Sports.click();
        logger.info("click Sports vertical");
    }

    public void clickaboutbi() {
        aboutbi.click();
        logger.info("click on about bi vertical");
    }

    public void clicklegalfineprint() {
        legalfineprint.click();
        logger.info("click on Legal Fine Print vertical");
    }

    public void clicksendfeedback() {
        SendFeedback.click();
        logger.info("click sendfeedback vertical");
    }

    public void clicksettings() {
        Settings.click();
        logger.info("click Settings vertical");
    }

    public void clickcopyright() {
       copyright.click();
       logger.info("click copyright");
    }

    public void currentVertical() {
        copyright.click();
        logger.info("click copyright ");
    }

    public void isCurrentVertical(String expectedVertical) throws MobileException {
        if (!currentVertical.getText().equals(expectedVertical))
            throw new MobileException("Verticals do not match: Current vertical is "+currentVertical.getText() + " and Expected vertical is "+expectedVertical);
        else
            logger.info("Current vertical is "+expectedVertical);
    }
}
