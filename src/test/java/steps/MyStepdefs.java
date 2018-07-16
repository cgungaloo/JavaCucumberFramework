package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pages.home.Home;
import pages.sign_in.SignIn;
import utils.Page_Factory;
import static org.junit.Assert.*;

public class MyStepdefs {

    private Home homepage;
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
//       homepage = Page_Factory.getHomePage();
//       assertTrue(homepage.checkHomePage());
        System.out.println("I am on the home page");
    }

    @When("^I enter the search term \"([^\"]*)\" into the search bar$")
    public void iEnterTheSearchTermIntoTheSearchBar(String arg0) throws Throwable {
//        homepage.SearchForItem(arg0);
//        homepage.SelectSearchByXpath();
        System.out.println("I am on the search items");
    }

    @When("^I click on Sign in$")
    public void iClickOnSignIn() throws Throwable {
//        homepage = Page_Factory.getHomePage();
//        homepage.clickOnElementByXPath("//*[@id=\"gb_70\"]");
        System.out.println("I am on the Sign in");
    }

    @When("^I click on terms$")
    public void iClickOnTerms() throws Throwable {
//        homepage.clickOnTerms();
        System.out.println("I clicked on terms");
    }

}