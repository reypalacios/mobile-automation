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
    public static WebElement yourmoney;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[10]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Wealth Advisor']")
    @AndroidFindBy(name = "Wealth Advisor")
    @iOSFindBy(name = "Wealth Advisor")
    public static WebElement wealthadvisor;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[11]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='POLITICS']")
    @AndroidFindBy(name = "POLITICS")
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
    public static WebElement careers;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[16]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Advertising']")
    @AndroidFindBy(name = "Advertising")
    @iOSFindBy(name = "Advertising")
    public static WebElement advertising;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[17]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Retail']")
    @AndroidFindBy(name = "Retail")
    @iOSFindBy(name = "Retail")
    public static WebElement retail;

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
        System.out.println("Click Favorites");
    }

    public void clickhome() throws InterruptedException {
        home.click();
        Thread.sleep(1000);
        System.out.println("click home Vertical");
    }

    public void clickLatest() throws InterruptedException {
        latest.click();
        Thread.sleep(2000);
        System.out.println("click Latest Vertical");
    }

    public void clicktech() throws InterruptedException {
        tech.click();
        Thread.sleep(1000);
        System.out.println("click tech Vertical");
    }

    public void clickenterprise() throws InterruptedException {
        enterprise.click();
        Thread.sleep(1000);
        System.out.println("click enterprise Vertical");
    }

    public void clickScience() throws InterruptedException {
        science.click();
        Thread.sleep(1000);
        System.out.println("click Science Vertical");
    }

    public void clickfinance() throws InterruptedException {
        finance.click();
        Thread.sleep(1000);
        System.out.println("click finance Vertical");
    }

    public void clickMarkets() {
        markets.click();
        System.out.println("click markets Vertical");
    }

    public void clickYourMoney() {
        yourmoney.click();
        System.out.println("click yourmoney Vertical");
    }

    public void clickWealthAdvisor() {
        wealthadvisor.click();
        System.out.println("click wealthadvisor Vertical");
    }

    public void clickpolitics() {
        politics.click();
        System.out.println("click politics Vertical");
    }

    public void clickmilitarydefense() {
        militarydefense.click();
        System.out.println("click militarydefense Vertical");
    }

    public void clicklaworder() {
        laworder.click();
        System.out.println("click law order Vertical");
    }

    public void clickstrategy() {
        strategy.click();
        System.out.println("click strategy Vertical");
    }

    public void clickCarrers() {
        careers.click();
        System.out.println("click Careers Vertical");
    }

    public void clickAdvertising() {
        advertising.click();
        System.out.println("click Advertising vertical");
    }

    public void clickRetail() {
        retail.click();
        System.out.println("click Retail vertical");
    }

    public void clickSmallBusiness() {
        smallbusiness.click();
        System.out.println("click Small Business vertical");
    }

    public void clickLife() {
        life.click();
        System.out.println("click life vertical");
    }

    public void clickTransportation() {
        transportation.click();
        System.out.println("click Transportation Vertical");
    }

    public void clickEducation() {
        education.click();
        System.out.println("click Education Vertical");
    }

    public void clickEntertainment() {
        entertainment.click();
        System.out.println("click Entertainment vertical");
    }

    public void clickSports() {
        sports.click();
        System.out.println("click Sports vertical");
    }

    public void clickaboutbi() {
        aboutbi.click();
        System.out.println("click on about bi vertical");
    }

    public void clicklegalfineprint() {
        legalfineprint.click();
        System.out.println("click on Legal Fine Print vertical");
    }

    public void clicksendfeedback() {
        sendfeedback.click();
        System.out.println("click sendfeedback vertical");
    }

    public void clicksettings() {
        settings.click();
        System.out.println("click Settings vertical");
    }

    public void clickcopyright() {
       copyright.click();
       System.out.println("click copyright");
    }

    public void currentVertical() {
        copyright.click();
        System.out.println("click copyright ");
    }

    public void isCurrentVertical(String expectedVertical) throws MobileException {
        if (!currentVertical.getText().equalsIgnoreCase(expectedVertical))
            throw new MobileException("Verticals do not match: Current vertical is "+currentVertical.getText() + " and Expected vertical is "+expectedVertical);
        else
            System.out.println("Current vertical is "+expectedVertical);
    }

    public void scrolldown(WebElement element) throws InterruptedException {
        //System.out.println("Scrolling down");
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
        System.out.println("Screen size is "+size);
        //Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.

        int starty = element.getLocation().getY(); //(int) (size.height * 0.80);

        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.15);
        // Find horizontal point where you want to swipe. It is in middle of screen width.
        int startx = size.width / 2;

        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        // Swipe from Bottom to Top.
        App.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
 /*       // Swipe from Top to Bottom.
        App.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
 */   }


}
