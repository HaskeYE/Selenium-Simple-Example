package selenium;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

        public WebDriver webDriver;

        public void initialize(String typeOfBrowser, String version) {

            if (typeOfBrowser.equals("Chrome")) {
                webDriver = Chrome.getWebDriver(version);
                System.out.println("WebDriver set up");
            }
            if (typeOfBrowser.equals("Firefox")) {
                webDriver = Firefox.getWebDriver(version);
                System.out.println("WebDriver set up");
            }
            if (webDriver == null)
                System.out.println("WebDriver not set up");
        }

        public WebDriver getDriver() {
            return webDriver;
        }

        public void end() {
            webDriver.quit();
            System.out.println("WebDriver is unset");
        }
    }


