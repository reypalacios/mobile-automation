package objectModels;

import appium.App;
import appium.MobileException;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rpalacios on 12/11/15.
 */
public class MastHeadObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(id = "drawer_vertical_list")
    public static WebElement Menu;

    @AndroidFindBy(xpath = "//*[@content-desc='Open Drawer']")
    @iOSFindBy(name = "EasyMenu Icon")
    public static WebElement HamburgerMenu;

    @AndroidFindBy(xpath = "//*[@content-desc='Close Drawer']")
    public static WebElement CloseMenu;

    @AndroidFindBy(id = "toolbar_image")
    public static WebElement BI;

    @AndroidFindBy(id = "toolbar_brand_text")
    public static WebElement Title;

    @AndroidFindBy(id = "search_articles_option")
   // @iOSFindBy(name = "")
    public static WebElement Search;

    @AndroidFindBy(id = "search_close_button")
   // @iOSFindBy(name = "")
    public static WebElement CloseSearch;

    @AndroidFindBy(xpath = "//*[@content-desc='More options']")
    public static WebElement KebabMenu;

    @iOSFindBy(xpath = "saved articles")
    public static WebElement saveArticle;

    @iOSFindBy(xpath = "jaksdhflakj")
    public static WebElement saveArticleNTF;

    public MastHeadObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickHamburgerMenu() throws InterruptedException {
        if (!Menu.isDisplayed()){
            HamburgerMenu.click();
        Thread.sleep(2500);
        }
        System.out.println("Menu is open");
    }

    public void clickBI() {
        BI.click();
        System.out.println("Click BI");
    }

    public void clickSearch() {
        Search.click();
        System.out.println("Click Search");
    }

    public void clickCloseSearch() {
        CloseSearch.click();
        System.out.println("Click Close Search");
    }

    public void clickKebabMenu() {
        KebabMenu.click();
        System.out.println("Click Kebab Menu");
    }

    public void isCurrentTitle(String expectedTitle) throws MobileException, IOException {
        String title = null;

        try{
            Title.isDisplayed();
            title=Title.getText();
        }catch (Exception e){
            title = "BUSINESS INSIDER";
        }

        if (!title.equalsIgnoreCase(expectedTitle))
            throw new MobileException("Titles do not match: Current title is "+title + " and Expected title is "+expectedTitle);
        else {
            System.out.println("Current title is " + expectedTitle);
            App.embedScreenshot();
        }
    }

    public void clickSaveArticle(){
        saveArticle.click();
    }

    public void verfitySavedArticleNotification(){
        if(saveArticleNTF.isDisplayed()){
            System.out.println("Articles was saved");
        }else{
            System.err.println("Saved article ntf wasn't displayed");
        }

    }
}


