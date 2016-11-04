package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class MenuObject {

    @AndroidFindBy(name = "FAVORITES")
    public static WebElement favorites;

    @AndroidFindBy(id = "drawer_list_item_function_text")
    @iOSFindBy(xpath = "//*[contains(@name,'Saved Articles')]")
    public static WebElement savedArticles;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HOME']")
    @iOSFindBy(xpath= "//UIATableCell[@name='HOME']")
    public static WebElement home;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Latest']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Latest']")
    public static WebElement latest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TECH']")
    @iOSFindBy(xpath = "//UIATableCell[@name='TECH']")
    public static WebElement tech;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enterprise']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Enterprise']")
    public static WebElement enterprise;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Science']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Science']")
    public static WebElement science;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FINANCE']")
    @iOSFindBy(xpath = "//UIATableCell[@name='FINANCE']")
    public static WebElement finance;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Markets']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Markets']")
    public static WebElement markets;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Money']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Your Money']")
    public static WebElement yourmoney;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wealth Advisor']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Wealth Advisor']")
    public static WebElement wealthadvisor;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='POLITICS']")
    @iOSFindBy(xpath = "//UIATableCell[@name='POLITICS']")
    public static WebElement politics;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Military & Defense']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Military & Defense']")
    public static WebElement militarydefense;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Law & Order']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Law & Order']")
    public static WebElement laworder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STRATEGY']")
    @iOSFindBy(xpath = "//UIATableCell[@name='STRATEGY']")
    public static WebElement strategy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Careers']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Careers']")
    public static WebElement careers;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Advertising']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Advertising']")
    public static WebElement advertising;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Retail']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Retail']")
    public static WebElement retail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Small Business']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Small Business']")
    public static WebElement smallbusiness;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIFE']")
    @iOSFindBy(xpath = "//UIATableCell[@name='LIFE']")
    public static WebElement life;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transportation']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Transportation']")
    public static WebElement transportation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Education']")
    @iOSFindBy(xpath = "//UIATableCell[@name='Education']")
    public static WebElement education;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ENTERTAINMENT']")
    @iOSFindBy(xpath = "//UIATableCell[@name='ENTERTAINMENT']")
    public static WebElement entertainment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sports']")
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

    public void clickVertical(String vertical) throws InterruptedException {
        switch (vertical.toLowerCase()){
            case "saved articles":{ savedArticles.click(); break; }
            case "latest":{ latest.click(); Thread.sleep(2000); break; }
            case "home":{ home.click(); Thread.sleep(1000); break; }
            case "tech":{ tech.click(); Thread.sleep(1000); break; }
            case "enterprise":{ enterprise.click(); Thread.sleep(1000); break; }
            case "science":{ science.click(); Thread.sleep(1000); break; }
            case "finance":{ finance.click(); Thread.sleep(1000); break; }
            case "markets":{ markets.click(); break; }
            case "your money":{ yourmoney.click(); break; }
            case "wealth advisor":{ wealthadvisor.click(); break; }
            case "politics":{ politics.click(); break; }
            case "military & defense":{ militarydefense.click(); break; }
            case "law & order":{ laworder.click(); break; }
            case "strategy":{ strategy.click(); break; }
            case "careers":{ careers.click(); break; }
            case "advertising":{ advertising.click(); break; }
            case "retail":{ retail.click(); break; }
            case "small business":{ smallbusiness.click(); break; }
            case "life":{ life.click(); break; }
            case "transportation":{ transportation.click(); break; }
            case "education":{ education.click(); break; }
            case "entertainment":{ entertainment.click(); break; }
            case "sports":{ sports.click(); break; }
            case "legal fine print":{ legalfineprint.click(); break; }
            case "send feedback":{ sendfeedback.click(); break; }
        }
    }
}
