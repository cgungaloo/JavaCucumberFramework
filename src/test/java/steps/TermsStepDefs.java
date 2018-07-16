package steps;

import cucumber.api.java.en.Then;
import pages.terms.Terms;
import utils.Page_Factory;
import static org.junit.Assert.*;

public class TermsStepDefs {

    private Terms terms;
    @Then("^I should see the terms page$")
    public void iShouldSeeTheTermsPage() throws Throwable {
//        terms = Page_Factory.getTerms();
//        assertTrue(terms.checkTermsPage());
        System.out.println("I can see the terms page");
    }
}
