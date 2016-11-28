package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

/**
 * Created by rpalacios on 12/11/15.
 */
public class SearchObject {

    @AndroidFindBy(id = "primary_search_field")
    @iOSFindBy(accessibility = "searchTextField")
    public static WebElement searchField;

    @iOSFindBy(accessibility = "Search")
    public static WebElement searchButton;

    public SearchObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void search(String keys) throws InterruptedException {
        searchField.sendKeys(keys);
        searchButton.click();
        Thread.sleep(5000);
    }
}


