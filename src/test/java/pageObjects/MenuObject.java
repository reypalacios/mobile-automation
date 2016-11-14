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

    @AndroidFindBy(id = "drawer_list_item_function_text")
    @iOSFindBy(accessibility = "//*[contains(@name,'Saved Articles')]")
    public static WebElement savedArticles;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HOME']")
    @iOSFindBy(accessibility = "HOME")
    public static WebElement home;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Latest']")
    @iOSFindBy(accessibility = "Latest")
    public static WebElement latest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TECH']")
    @iOSFindBy(accessibility = "TECH")
    public static WebElement tech;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enterprise']")
    @iOSFindBy(accessibility = "Enterprise")
    public static WebElement enterprise;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Science']")
    @iOSFindBy(accessibility = "Science")
    public static WebElement science;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FINANCE']")
    @iOSFindBy(accessibility = "FINANCE")
    public static WebElement finance;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Markets']")
    @iOSFindBy(accessibility = "Markets")
    public static WebElement markets;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Money']")
    @iOSFindBy(accessibility = "Your Money")
    public static WebElement yourMoney;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wealth Advisor']")
    @iOSFindBy(accessibility = "Wealth Advisor")
    public static WebElement wealthAdvisor;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='POLITICS']")
    @iOSFindBy(accessibility = "POLITICS")
    public static WebElement politics;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Military & Defense']")
    @iOSFindBy(accessibility = "Military & Defense")
    public static WebElement militaryDefense;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Law & Order']")
    @iOSFindBy(accessibility = "Law & Order")
    public static WebElement lawOrder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STRATEGY']")
    @iOSFindBy(accessibility = "STRATEGY")
    public static WebElement strategy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Careers']")
    @iOSFindBy(accessibility = "Careers")
    public static WebElement careers;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Advertising']")
    @iOSFindBy(accessibility = "Advertising")
    public static WebElement advertising;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Retail']")
    @iOSFindBy(accessibility = "Retail")
    public static WebElement retail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Small Business']")
    @iOSFindBy(accessibility = "Small Business")
    public static WebElement smallBusiness;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIFE']")
    @iOSFindBy(accessibility = "LIFE")
    public static WebElement life;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transportation']")
    @iOSFindBy(accessibility = "Transportation")
    public static WebElement transportation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Education']")
    @iOSFindBy(accessibility = "Education")
    public static WebElement education;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ENTERTAINMENT']")
    @iOSFindBy(accessibility = "ENTERTAINMENT")
    public static WebElement entertainment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sports']")
    @iOSFindBy(accessibility = "Sports")
    public static WebElement sports;

    @iOSFindBy(accessibility = "ABOUT BI")
    public static WebElement aboutbi;

    @iOSFindBy(accessibility = "Legal Fine Print")
    public static WebElement legalFinePrint;

    @iOSFindBy(accessibility = "Send Feedback")
    public static WebElement sendFeedback;

    @iOSFindBy(accessibility = "Settings")
    public static WebElement settings;

    @iOSFindBy(accessibility = "copyrightCell")
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
            case "your money":{ yourMoney.click(); break; }
            case "wealth advisor":{ wealthAdvisor.click(); break; }
            case "politics":{ politics.click(); break; }
            case "military & defense":{ militaryDefense.click(); break; }
            case "law & order":{ lawOrder.click(); break; }
            case "strategy":{ strategy.click(); break; }
            case "careers":{ careers.click(); break; }
            case "advertising":{ advertising.click(); break; }
            case "retail":{ retail.click(); break; }
            case "small business":{ smallBusiness.click(); break; }
            case "life":{ life.click(); break; }
            case "transportation":{ transportation.click(); break; }
            case "education":{ education.click(); break; }
            case "entertainment":{ entertainment.click(); break; }
            case "sports":{ sports.click(); break; }
            case "legal fine print":{ legalFinePrint.click(); break; }
            case "send feedback":{ sendFeedback.click(); break; }
        }
    }
}
