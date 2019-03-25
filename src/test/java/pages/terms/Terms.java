package pages.terms;

import org.openqa.selenium.WebElement;
import pages.PageModel;

import static java.lang.Thread.sleep;

public abstract class Terms extends PageModel{

    public Boolean checkTermsPage() throws InterruptedException {
//        Thread.sleep(5000);
        WebElement termsHighlight= this.getElementsByXpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz[1]/div[1]/div/h1[2]");
        //*[@id="yDmH0d"]/c-wiz/div/div/c-wiz[1]/div[1]/ul/li[3]/a
        //*[@id="yDmH0d"]/c-wiz/div/div/c-wiz[1]/div[1]/div/h1[2]
        System.out.println("Terms is : "+termsHighlight.getText());
        return termsHighlight.getText().equals("Terms of Service");
    }
}
