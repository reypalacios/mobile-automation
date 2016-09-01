package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setUpClasses.App;
import setUpClasses.MobileException;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class MenuObject {

    @AndroidFindBy(name = "FAVORITES")
    public static WebElement favorites;

    @AndroidFindBy(name = "SAVED ARTICLES")
    @iOSFindBy(xpath = "//*[contains(@name,'Saved Articles')]")
    public static WebElement savedArticles;

    @AndroidFindBy(name = "HOME")
    @iOSFindBy(xpath= "//UIATableCell[@name='HOME']")
    public static WebElement home;

    @AndroidFindBy(name = "Latest")
    @iOSFindBy(xpath = "//UIATableCell[@name='Latest']")
    public static WebElement latest;

    @AndroidFindBy(name = "TECH")
    @iOSFindBy(xpath = "//UIATableCell[@name='TECH']")
    public static WebElement tech;

    @AndroidFindBy(name = "Enterprise")
    @iOSFindBy(xpath = "//UIATableCell[@name='Enterprise']")
    public static WebElement enterprise;

    @AndroidFindBy(name = "Science")
    @iOSFindBy(xpath = "//UIATableCell[@name='Science']")
    public static WebElement science;

    @AndroidFindBy(name = "FINANCE")
    @iOSFindBy(xpath = "//UIATableCell[@name='FINANCE']")
    public static WebElement finance;

    @AndroidFindBy(name = "Markets")
    @iOSFindBy(xpath = "//UIATableCell[@name='Markets']")
    public static WebElement markets;

    @AndroidFindBy(name = "Your Money")
    @iOSFindBy(xpath = "//UIATableCell[@name='Your Money']")
    public static WebElement yourmoney;

    @AndroidFindBy(name = "Wealth Advisor")
    @iOSFindBy(xpath = "//UIATableCell[@name='Wealth Advisor']")
    public static WebElement wealthadvisor;

    @AndroidFindBy(name = "POLITICS")
    @iOSFindBy(xpath = "//UIATableCell[@name='POLITICS']")
    public static WebElement politics;

    @AndroidFindBy(name = "Military & Defense")
    @iOSFindBy(xpath = "//UIATableCell[@name='Military & Defense']")
    public static WebElement militarydefense;

    @AndroidFindBy(name = "Law & Order")
    @iOSFindBy(xpath = "//UIATableCell[@name='Law & Order']")
    public static WebElement laworder;

    @AndroidFindBy(name = "STRATEGY")
    @iOSFindBy(xpath = "//UIATableCell[@name='STRATEGY']")
    public static WebElement strategy;

    @AndroidFindBy(name = "Careers")
    @iOSFindBy(xpath = "//UIATableCell[@name='Careers']")
    public static WebElement careers;

    @AndroidFindBy(name = "Advertising")
    @iOSFindBy(xpath = "//UIATableCell[@name='Advertising']")
    public static WebElement advertising;

    @AndroidFindBy(name = "Retail")
    @iOSFindBy(xpath = "//UIATableCell[@name='Retail']")
    public static WebElement retail;

    @AndroidFindBy(name = "Small Business")
    @iOSFindBy(xpath = "//UIATableCell[@name='Small Business']")
    public static WebElement smallbusiness;

    @AndroidFindBy(name = "LIFE")
    @iOSFindBy(xpath = "//UIATableCell[@name='LIFE']")
    public static WebElement life;

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

    public void isCurrentVertical(String expectedVertical) throws MobileException {

        try {
            Assert.assertEquals(currentVertical.getText().toLowerCase(), expectedVertical.toLowerCase());
        }catch (Exception e){
            new MobileException(e);
        }

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
