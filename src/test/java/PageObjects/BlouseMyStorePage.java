package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BlouseMyStorePage {


    @FindBy (xpath = "//*[@id=\"color_11\"]")
    WebElement colourOfTheBlouseInput;

    @FindBy(xpath = "//span[contains(text(), 'Add to cart')]")
    WebElement addToCartBtm;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span" )
    WebElement proceedToCheckoutBtm;


    public void selectBlackColorOfTheBlouse (){
        colourOfTheBlouseInput.click();
    }


    public void addToCart ()  {
        addToCartBtm.click();
    }

    public void proceedingToCheckoutFromTheBlousePage()  {
        proceedToCheckoutBtm.click();
    }


    public BlouseMyStorePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
