package conditions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class ElementPresent implements ExpectedCondition<WebElement> {

    private WebElement proxy;

    public ElementPresent(WebElement proxy) {
        this.proxy = proxy;
    }

    @Override
    public WebElement apply(WebDriver d) {
        try {
            proxy.getTagName();
        } catch (NoSuchElementException e) {
            return null;
        }
        return proxy;
    }
}
