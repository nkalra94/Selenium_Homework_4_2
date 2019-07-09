package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanMyStorePage {

    @FindBy(xpath = "//a[@class='product-name'][contains(text(), 'Blouse')]")
    WebElement randomCloses;

    public void selectRandomCloses (){
        randomCloses.click();
    }


    public WomanMyStorePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
