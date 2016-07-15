package objectModels;

import appium.App;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by kislam on 04/29/16.
 */
public class SearchObject {

    Logger logger = Logger.getLogger(this.getClass());

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public static WebElement searchicon;

    @iOSFindBy(name = " EasyClose Icon")
    public static WebElement Closeicon;

//    @iOSFindBy (xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
    public static WebElement searchResult;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")
    public static WebElement searchField;



    /*@iOSFindBy(name = "A large number of Apple services stopped working properly")
    public static WebElement Searchresultclick;*/

    public SearchObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.IOSdriver), this);
    }

    public void OpenSearch() {
        searchicon.click();
        logger.info("Click Search");

    }


    public void search(String searchTerm) throws InterruptedException {
        searchField.sendKeys(searchTerm);
        logger.info("Type" +searchTerm+" in Search");

        App.IOSdriver.hideKeyboard("Search");
        Thread.sleep(5000);
    }

    public void Searchresultclick(int position) throws InterruptedException {

        String xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell["+position+"]";
        App.IOSdriver.findElementByXPath(xpath).click();
        logger.info("Search result click " + position);
        Thread.sleep(4000);
        }



    public void CloseSearch() {
        Closeicon.click();
        logger.info("Click close Search");

    }
    public void clickSearchResult (){
    searchResult.click();

    }

    public void clickSearchResult(String title) throws InterruptedException {
        App.IOSdriver.findElementByXPath("//UIATableView[1]/UIATableCell/UIAStaticText[contains(@name,'"+title+"')]").click();
        App.IOSdriver.findElementByXPath("//UIATableView[1]/UIATableCell/UIAStaticText[contains(@name,'"+title+"')]").click();
    }
}
