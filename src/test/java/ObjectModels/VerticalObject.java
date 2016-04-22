package objectModels;

import appium.App;
import appium.MobileException;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class VerticalObject {

    Logger logger = Logger.getLogger(this.getClass());

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[@text='FAVORITES']")
    @AndroidFindBy(name = "FAVORITES")
    public static WebElement favorites;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='HOME']")
    @AndroidFindBy(name = "HOME")
    @iOSFindBy(xpath= "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[2]/UIATableCell[2]")
    public static WebElement home;

    //@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.TextView[@text='Latest']")
    @AndroidFindBy(name = "Latest")
    @iOSFindBy(name = "Latest")
    public static WebElement latest;

    //@AndroidFindBy (xpath = "//android.widget.TextView[@text='TECH']")
    @AndroidFindBy(name = "TECH")
    @iOSFindBy(name = "TECH")
    public static WebElement tech;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[5]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Enterprise']")
    @AndroidFindBy(name = "Enterprise")
    @iOSFindBy(name = "Enterprise")
    public static WebElement enterprise;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[6]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Science']")
    @AndroidFindBy(name = "Science")
    @iOSFindBy(name = "Science")
    public static WebElement science;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[7]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='FINANCE']")
    @AndroidFindBy(name = "FINANCE")
    @iOSFindBy(name = "FINANCE")
    public static WebElement finance;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[8]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Markets']")
    @AndroidFindBy(name = "Markets")
    @iOSFindBy(name = "markets")
    public static WebElement markets;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[9]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Your Money']")
    @AndroidFindBy(name = "Your Money")
    @iOSFindBy(name = "Your Money")
    public static WebElement YourMoney;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[10]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Wealth Advisor']")
    @AndroidFindBy(name = "Wealth Advisor")
    @iOSFindBy(name = "Wealth Advisor")
    public static WebElement wealthAdvisor;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[11]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='POLITICS']")
    @AndroidFindBy(name = "Politics")
    @iOSFindBy(name = "Politics")
    public static WebElement politics;

    //@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]//android.widget.TextView[@text='Military & Defense']")
    @AndroidFindBy(name = "Military & Defense")
    @iOSFindBy(name = "Military & Defense")
    public static WebElement militarydefense;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[13]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Law & Order']")
    @AndroidFindBy(name = "Law & Order")
    @iOSFindBy(name = "Law & Order")
    public static WebElement laworder;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[14]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='STRATEGY']")
    @AndroidFindBy(name = "STRATEGY")
    @iOSFindBy(name = "STRATEGY")
    public static WebElement strategy;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[15]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Careers']")
    @AndroidFindBy(name = "Careers")
    @iOSFindBy(name = "Careers")
    public static WebElement Careers;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[16]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Advertising']")
    @AndroidFindBy(name = "Advertising")
    @iOSFindBy(name = "Advertising")
    public static WebElement Advertising;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[17]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Retail']")
    @AndroidFindBy(name = "Retail")
    @iOSFindBy(name = "Retail")
    public static WebElement Retail;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[18]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Small Business']")
    @AndroidFindBy(name = "Small Business")
    @iOSFindBy(name = "Small Business")
    public static WebElement smallbusiness;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[19]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='LIFE']")
    @AndroidFindBy(name = "LIFE")
    @iOSFindBy(name = "LIFE")
    public static WebElement life;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[20]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Transportation']")
    @AndroidFindBy(name = "Transportation")
    @iOSFindBy(name = "Transportation")
    public static WebElement transportation;

    @AndroidFindBy(name = "Education")
    @iOSFindBy(name = "Education")
    public static WebElement education;

    @AndroidFindBy(name = "ENTERTAINMENT")
    @iOSFindBy(name = "ENTERTAINMENT")
    public static WebElement entertainment;

    @AndroidFindBy(name = "Sports")
    @iOSFindBy(name = "Sports")
    public static WebElement sports;

    @iOSFindBy(name = "ABOUT BI")
    public static WebElement aboutbi;

    @iOSFindBy(name = "Legal Fine Print")
    public static WebElement legalfineprint;

    @iOSFindBy(name = "Send Feedback")
    public static WebElement sendfeedback;

    @iOSFindBy(name = "Settings")
    public static WebElement settings;

    @iOSFindBy(name = "©2015 Business Insider, Inc. All rights reserved.  Use of this app constitutes acceptance of our  Terms of Service and Privacy Policy.")
    public static WebElement copyright;

    @AndroidFindBy(id = "android:id/action_bar_title")
    public static WebElement currentVertical;

    public VerticalObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickFavorites() {
        favorites.click();
        logger.info("Click Favorites");
    }

    public void clickhome() throws InterruptedException {
        home.click();
        Thread.sleep(1000);
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

    public void clickenterprise() throws InterruptedException {
        enterprise.click();
        Thread.sleep(1000);
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
        wealthAdvisor.click();
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
        smallbusiness.click();
        logger.info("click Small Business vertical");
    }

    public void clickLife() {
        life.click();
        logger.info("click life vertical");
    }

    public void clickTransportation() {
        transportation.click();
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
        sports.click();
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
        sendfeedback.click();
        logger.info("click sendfeedback vertical");
    }

    public void clicksettings() {
        settings.click();
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
        if (!currentVertical.getText().equalsIgnoreCase(expectedVertical))
            throw new MobileException("Verticals do not match: Current vertical is "+currentVertical.getText() + " and Expected vertical is "+expectedVertical);
        else
            logger.info("Current vertical is "+expectedVertical);
    }

    public void scrolldown(WebElement element) throws InterruptedException {
        //logger.info("Scrolling down");
        /*JavascriptExecutor js = (JavascriptExecutor) App.wd;
        HashMap<String, String> scrollObject = new HashMap<String, String>();scrollObject.put("direction", "down");
        scrollObject.put("element", ((RemoteWebElement) life).getId());
        js.executeScript("mobile: scroll", scrollObject);*/
        /*for (int t = 0; t < 5; t++)*/
        //App.wd.scrollTo("Volkswagen");

        swipingVertical(element);
        //swipingHorizontal();
    }
    public void swipingVertical(WebElement element) throws InterruptedException {
        //Get the size of screen.
        Dimension size;
        size = App.driver.manage().window().getSize();
        logger.info("Screen size is "+size);
        //Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.

        int starty = element.getLocation().getY(); //(int) (size.height * 0.80);

        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.15);
        // Find horizontal point where you want to swipe. It is in middle of screen width.
        int startx = size.width / 2;

        logger.info("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        // Swipe from Bottom to Top.
        App.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
 /*       // Swipe from Top to Bottom.
        App.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
 */   }

    public void swipingHorizontal() throws InterruptedException {
        //Get the size of screen.
        Dimension size;
        size = App.driver.manage().window().getSize();
        System.out.println(size);
        //Find swipe start and end point from screen's with and height.
        // Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.80);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.10);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
        //Swipe from Right to Left.
        App.driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);
        //Swipe from Left to Right.
        App.driver.swipe(endx, starty, startx, starty, 3000);
        Thread.sleep(2000);
    }
}
