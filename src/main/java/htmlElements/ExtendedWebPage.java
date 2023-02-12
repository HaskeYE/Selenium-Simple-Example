package htmlElements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.extension.DriverProvider;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactoryProvider;
import selenium.WebDriverFactory;


/**
 * HtmlElements is not supported for later Selenium versions after 3.10.0, 
 * this is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public interface ExtendedWebPage<FluentType> extends WebPage {

    @DriverProvider
    WebDriver getWrappedDriver();

    /*@IsAtPageMethod
    void isAtPage(Matcher<String> url);*/

    /*@Override
    default void isAt(Matcher<String> url) {
        isAtPage(url);
    }*/

    @Override
        default void open(String s) {
        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();
        webDriverFactory.getDriver().get(s);
    }
}
