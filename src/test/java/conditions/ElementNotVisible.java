package conditions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class ElementNotVisible implements ExpectedCondition<Boolean> {

    private WebElement proxy;

    public ElementNotVisible(WebElement proxy) {
        this.proxy = proxy;
    }

    @Override
    public Boolean apply(WebDriver d) {
        try {
            return !proxy.isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        } catch (StaleElementReferenceException e) {
            return true;
        }
    }
}
