package objectModels;

import setUpClasses.App;
import setUpClasses.MobileException;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class MenuObject {

    Logger logger = Logger.getLogger(this.getClass());

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[@text='FAVORITES']")
    @AndroidFindBy(name = "FAVORITES")
    public static WebElement favorites;

    @AndroidFindBy(name = "SAVED ARTICLES")
    public static WebElement savedArticles;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='HOME']")
    @AndroidFindBy(name = "HOME")
    @iOSFindBy(xpath= "//UIATableCell[@name='HOME']")
    public static WebElement home;

    //@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.TextView[@text='Latest']")
    @AndroidFindBy(name = "Latest")
    @iOSFindBy(xpath = "//UIATableCell[@name='Latest']")
    public static WebElement latest;

    //@AndroidFindBy (xpath = "//android.widget.TextView[@text='TECH']")
    @AndroidFindBy(name = "TECH")
    @iOSFindBy(xpath = "//UIATableCell[@name='TECH']")
    public static WebElement tech;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[5]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Enterprise']")
    @AndroidFindBy(name = "Enterprise")
    @iOSFindBy(xpath = "//UIATableCell[@name='Enterprise']")
    public static WebElement enterprise;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[6]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Science']")
    @AndroidFindBy(name = "Science")
    @iOSFindBy(xpath = "//UIATableCell[@name='Science']")
    public static WebElement science;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[7]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='FINANCE']")
    @AndroidFindBy(name = "FINANCE")
    @iOSFindBy(xpath = "//UIATableCell[@name='FINANCE']")
    public static WebElement finance;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[8]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Markets']")
    @AndroidFindBy(name = "Markets")
    @iOSFindBy(xpath = "//UIATableCell[@name='Markets']")
    public static WebElement markets;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[9]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Your Money']")
    @AndroidFindBy(name = "Your Money")
    @iOSFindBy(xpath = "//UIATableCell[@name='Your Money']")
    public static WebElement yourmoney;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[10]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Wealth Advisor']")
    @AndroidFindBy(name = "Wealth Advisor")
    @iOSFindBy(xpath = "//UIATableCell[@name='Wealth Advisor']")
    public static WebElement wealthadvisor;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[11]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='POLITICS']")
    @AndroidFindBy(name = "POLITICS")
    @iOSFindBy(xpath = "//UIATableCell[@name='POLITICS']")
    public static WebElement politics;

    //@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]//android.widget.TextView[@text='Military & Defense']")
    @AndroidFindBy(name = "Military & Defense")
    @iOSFindBy(xpath = "//UIATableCell[@name='Military & Defense']")
    public static WebElement militarydefense;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[13]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Law & Order']")
    @AndroidFindBy(name = "Law & Order")
    @iOSFindBy(xpath = "//UIATableCell[@name='Law & Order']")
    public static WebElement laworder;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[14]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='STRATEGY']")
    @AndroidFindBy(name = "STRATEGY")
    @iOSFindBy(xpath = "//UIATableCell[@name='STRATEGY']")
    public static WebElement strategy;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[15]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Careers']")
    @AndroidFindBy(name = "Careers")
    @iOSFindBy(xpath = "//UIATableCell[@name='Careers']")
    public static WebElement careers;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[16]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Advertising']")
    @AndroidFindBy(name = "Advertising")
    @iOSFindBy(xpath = "//UIATableCell[@name='Advertising']")
    public static WebElement advertising;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[17]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Retail']")
    @AndroidFindBy(name = "Retail")
    @iOSFindBy(xpath = "//UIATableCell[@name='Retail']")
    public static WebElement retail;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[18]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Small Business']")
    @AndroidFindBy(name = "Small Business")
    @iOSFindBy(xpath = "//UIATableCell[@name='Small Business']")
    public static WebElement smallbusiness;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[19]/android.widget.RelativeLayout[1]/android.widget.TextView[@text='LIFE']")
    @AndroidFindBy(name = "LIFE")
    @iOSFindBy(xpath = "//UIATableCell[@name='LIFE']")
    public static WebElement life;

    //@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[20]/android.widget.FrameLayout[1]/android.widget.TextView[@text='Transportation']")
    @AndroidFindBy(name = "Transportation")
    @iOSFindBy(xpath = "//UIATableCell[@name='Transportation']")
    public static WebElement transportation;

    @AndroidFindBy(name = "Education")
    @iOSFindBy(xpath = "//UIATableCell[@name='Education']")
    public static WebElement education;

    @AndroidFindBy(name = "ENTERTAINMENT")
    @iOSFindBy(xpath = "//UIATableCell[@name='ENTERTAINMENT']")
    public static WebElement entertainment;

    @AndroidFindBy(name = "Sports")
    @iOSFindBy(xpath = "//UIATableCell[@name='Sports']")
    public static WebElement sports;

    @iOSFindBy(xpath = "//UIATableCell[@name='ABOUT BI']")
    public static WebElement aboutbi;

    @iOSFindBy(xpath = "//UIATableCell[@name='Legal Fine Print']")
    public static WebElement legalfineprint;

    @iOSFindBy(xpath = "//UIATableCell[@name='Send Feedback']")
    public static WebElement sendfeedback;

    @iOSFindBy(xpath = "//UIATableCell[@name='Settings']")
    public static WebElement settings;

    @iOSFindBy(xpath = "//UIATableCell[@name='©2015 Business Insider, Inc. All rights reserved.  Use of this app constitutes acceptance of our  Terms of Service and Privacy Policy.']")
    public static WebElement copyright;

    @AndroidFindBy(id = "android:id/action_bar_title")
    public static WebElement currentVertical;

    public MenuObject() {
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


    public void clickVertical(String vertical) throws InterruptedException {
        switch (vertical.toLowerCase()){
            case "latest":{ clickLatest(); break; }
            case "home":{ clickhome(); break; }
            case "tech":{ clicktech(); break; }
            case "enterprise":{ clickenterprise(); break; }
            case "science":{ clickScience(); break; }
            case "finance":{ clickfinance(); break; }
            case "markets":{ clickMarkets(); break; }
            case "your money":{ clickYourMoney(); break; }
            case "wealth advisor":{ clickWealthAdvisor(); break; }
            case "politics":{ clickpolitics(); break; }
            case "military & defense":{ clickmilitarydefense(); break; }
            case "law & order":{ clicklaworder(); break; }
            case "strategy":{ clickstrategy(); break; }
            case "careers":{ clickCarrers(); break; }
            case "advertising":{ clickAdvertising(); break; }
            case "retail":{ clickRetail(); break; }
            case "small business":{ clickSmallBusiness(); break; }
            case "life":{ clickLife(); break; }
            case "transportation":{ clickTransportation(); break; }
            case "education":{ clickEducation(); break; }
            case "entertainment":{ clickEntertainment(); break; }
            case "sports":{ clickSports(); break; }
            case "legal fine print":{ clicklegalfineprint(); break; }
            case "send feedback":{ clicksendfeedback(); break; }
        }
    }
}
