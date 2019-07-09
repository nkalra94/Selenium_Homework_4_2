package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MyAccountPage {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenClosesBtm;

    public void goToWomenCloses (){
        womenClosesBtm.click();
    }

    public MyAccountPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
