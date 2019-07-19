package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanMPage {

    @FindBy(xpath = "//a[@class='product-name'][contains(text(), 'Blouse')]")
    WebElement randomCloses;

    public void selectRandomCloses (){
        randomCloses.click();
    }


    public WomanMPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
