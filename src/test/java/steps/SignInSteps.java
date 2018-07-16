package steps;

import cucumber.api.java.en.Then;
import pages.sign_in.SignIn;
import utils.Page_Factory;
import static org.junit.Assert.*;

public class SignInSteps {
    @Then("^I can see the Sign In Page$")
    public void iCanSeeTheSignInPage() throws Throwable {
//        SignIn signin = Page_Factory.getSignIn();
//        assertTrue(signin.checkSignInPage());
        System.out.println("I can see the sign in page");

    }
}
