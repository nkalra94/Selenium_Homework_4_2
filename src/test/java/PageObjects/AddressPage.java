package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddressPage {
    @FindBy(id = "address1")
    private WebElement addressFieldInput;

    @FindBy(id = "city")
    private WebElement cityFieldInput;

    @FindBy(id = "id_state")
    private WebElement stateSelectInput;

    @FindBy(id = "postcode")
    private WebElement postCodeInput;

    @FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
    WebElement saveChangesBtm;



    public void setAddressFieldInput (String newAddress){
        addressFieldInput.clear();
        addressFieldInput.sendKeys(newAddress);
    }

    public void setCityFieldInput (String newCity){
        cityFieldInput.clear();
        cityFieldInput.sendKeys(newCity);
    }

    public void setStateSelectInput (String newState){
        Select selectState = new Select(stateSelectInput);
        selectState.selectByVisibleText(newState);
    }

    public void setPostCodeInput (String newPOstCode){
        postCodeInput.clear();
        postCodeInput.sendKeys(newPOstCode);
    }

    public void saveAddressChanging (){
        saveChangesBtm.click();
    }

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
