package pages.home;

import org.openqa.selenium.WebElement;
import pages.PageModel;

public abstract class Home extends PageModel {
    public Boolean checkHomePage(){
        WebElement appsIcon =this.getElementsByXpath("//*[@id=\"gbwa\"]/div[1]/a");
        WebElement gmailIcon = this.getElementsByXpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a");
        Boolean isAppsIconPresent =appsIcon.getAttribute("title").equals("Google apps");
        Boolean isGmailIconPresent = gmailIcon.getText().equals("Gmail");
        return isAppsIconPresent && isGmailIconPresent;
    }

    public void SearchForItem(String searchItem){
//        this.sendKeysByXPath("//*[@id=\"lst-ib\"]",searchItem);
        this.sendKeysByXPath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input",searchItem);
    }

    public void SelectSearchByXpath(){
        //*[@id="tsf"]/div[2]/div/div[1]/div/div[1]/input
//        this.PressEnterByXpath("//*[@id=\"lst-ib\"]");
        this.PressEnterByXpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
    }

    public void clickOnTerms(){
        this.clickOnElementByXPath("//*[@id=\"fsr\"]/a[2]");
    }
}
