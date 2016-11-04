package conditions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class ElementsPresent implements ExpectedCondition<List<WebElement>> {

    private List<WebElement> proxy;

    public ElementsPresent(List<WebElement> proxy) {
        this.proxy = proxy;
    }

    @Override
    public List<WebElement> apply(WebDriver d) {
        try {
            return proxy.size() > 0 ? proxy : null;
        } catch(NoSuchElementException e) {
            return null;
        }
    }
}

