package pages.search_results;
import org.openqa.selenium.WebElement;
import pages.PageModel;
import java.util.List;

public abstract class SearchResults extends PageModel{

    public Boolean checkSearchResults(String searchText){
        WebElement searchBarItem = this.getElementsByXpath("//*[@id=\"lst-ib\"]");
        Boolean isSearchItemInBar = searchBarItem.getAttribute("value").equals(searchText);
        return isSearchItemInBar;
    }

    public Boolean checkTabs(List<String> tabs){
        Integer divnum =1;
        String xpath;
        for(String tab : tabs){
            if(divnum > 1 && divnum !=6){
                xpath = "//*[@id=\"hdtb-msb-vis\"]/div[" + divnum.toString() +"]/a";
            }else if(divnum ==6) {
                xpath ="  //*[@id=\"hdtb-msb\"]/div[1]/g-header-menu/a";
            }else{
                xpath = "//*[@id=\"hdtb-msb-vis\"]/div[1]";
            }

            WebElement tabItem = this.getElementsByXpath(xpath);
            if(tabItem.getText().equals(tab) ==false){
                System.out.println(tab + "Did not match");
                return false;
            }
            divnum++;
        }
        return true;
    }
}