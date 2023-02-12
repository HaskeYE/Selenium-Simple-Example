package steps;


import htmlElements.MyPageFactory;
import htmlElements.MyPageFactoryProvider;
import pages.HomePage;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class HomePageSteps {
    public static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }


    public SearchSteps searchField() {
        homePage().searchField().waitUntil(displayed()).click();
        return new SearchSteps();
    }
}
