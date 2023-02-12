import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import steps.OpenPageSteps;

import java.util.List;

import static steps.HomePageSteps.pageFactory;

public class TestOpenGoogle {
    WebDriver webDriver;
    WebDriverFactory webdriverFactory;

    HomePage homepage() {
        return pageFactory.on(HomePage.class);
    }

    @Before
    public void initWebDriver() {
        webdriverFactory = WebDriverFactoryProvider.getInstance();
        webdriverFactory.initialize("Chrome", "3.12.0");
        webDriver = webdriverFactory.getDriver();
    }

    @Test
    public void testFirst() {
        webDriver.get("https://192.168.2.1:55055");
        //Thread.sleep(1000);

        WebElement searchField = webDriver.findElement(By.xpath("//input[@title='Search']"));
        searchField.click();
        searchField.sendKeys("Skyrim");

        searchField.submit();
        //Thread.sleep(1000);

        List<WebElement> searchResults = webDriver.findElements(By.xpath("//div[contains(@class, 'TzHB6b')]"));
        assert(searchResults.size() > 0);
    }

    @Test
    public void testSecond() throws InterruptedException {
        new OpenPageSteps()
                .openHomepage();
        Thread.sleep(2000);
    }

    @After
    public void closeWebdriver() {
        webDriver.quit();
    }
}
