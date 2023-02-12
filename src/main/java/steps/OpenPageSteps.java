package steps;

import htmlElements.MyPageFactory;
import htmlElements.MyPageFactoryProvider;
import pages.HomePage;

public class OpenPageSteps {
    private static final MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    //private HomePage homePage() { return pageFactory.on(HomePage.class); } // use .on method of MyPageFactoryProvider

    public HomePageSteps openHomepage() {
        pageFactory
                .on(HomePage.class)
                .open("https://www.google.com/");
        System.out.println("page opened");
        return new HomePageSteps();  /*since homepage is opened after opening page, openHomepage() will give you access
         to HomePageSteps*/ }
}
