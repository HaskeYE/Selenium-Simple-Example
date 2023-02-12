package steps;

import htmlElements.MyPageFactory;
import htmlElements.MyPageFactoryProvider;
import pages.HomePage;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class SearchSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();


   /* public SearchSteps inputSearchTerm(String term) {
        searchSidebar().searchField().waitUntil(displayed()).sendKeys(term);
        return this;
    }

    public SearchResultsPageSteps clickSearchIcon() {
        searchSidebar().searchButton().waitUntil(displayed()).click();
        return new SearchResultsPageSteps();
    }*/

}
