package pages.sign_in;

import org.openqa.selenium.WebElement;
import pages.PageModel;

public abstract class SignIn extends PageModel {
    public Boolean checkSignInPage(){
        WebElement signInSign = this.getElementsByXpath("//*[@id=\"headingText\"]");
        return signInSign.getText().equals("Sign in");

    }
}
