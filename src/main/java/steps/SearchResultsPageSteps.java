package steps;

import htmlElements.MyPageFactory;
import htmlElements.MyPageFactoryProvider;
import pages.HomePage;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    /*private SearchResultsPage searchResultsPage() { return pageFactory.on(SearchResultsPage.class); }

    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(int numProducts){
        assert (searchResultsPage().productsListedAfterSearch().size() == numProducts);
        return this;
    }*/
}
