package htmlElements;

import org.hamcrest.Matcher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.w3c.dom.html.HTMLInputElement;


public interface ExtendedMyWebElement<FluentType> extends WebElement, Locatable {
    HTMLInputElement waitUntil(Matcher<WebElement> displayed);
}
