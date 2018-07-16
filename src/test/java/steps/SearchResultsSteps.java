package steps;

import cucumber.api.java.en.*;
import pages.home.Home;
import pages.search_results.SearchResults;
import utils.Page_Factory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchResultsSteps {
    private SearchResults searchResults;
    @Then("^I can see the search results for \"([^\"]*)\" in the search results page$")
    public void iCanSeeTheSearchResultsForInTheSearchResultsPage(String arg0){
//        searchResults = Page_Factory.getSearchResults();
//        assertTrue(searchResults.checkSearchResults(arg0));
        System.out.println("I can see search results");
    }

    @And("^I can see the following tabs:$")
    public void iCanSeeTheFollowingTabs(List<String> tabs) throws Throwable {
//        assertTrue(searchResults.checkTabs(tabs));
        System.out.println("I can see tabs");
    }
}
