package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdeStorePage {

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    WebElement proceedToCheckoutFromSummaryBtm;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[7]/a/span")
    WebElement updatingAddressBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedToCheckoutFromAddressBtm;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    WebElement agreeWithTermsCheckBox;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    WebElement proceedToCheckoutFromShippingBtm;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    WebElement payByCheckBtm;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmingOrderBtm;




    public void proceedToCheckoutFromSummary() {
        proceedToCheckoutFromSummaryBtm.click();
    }

    public void updateTheDeliveryAddress(){
        updatingAddressBtn.click();
    }

    public void proceedToCheckoutFromAddress() {
        proceedToCheckoutFromAddressBtm.click();
    }

    public void agreeWithTerms() {
        agreeWithTermsCheckBox.click();
    }

    public void proceedToCheckoutFromShipping() {
        proceedToCheckoutFromShippingBtm.click();
    }

    public void payByCheckOption() {
        payByCheckBtm.click();
    }

    public void confirmOrder() {
        confirmingOrderBtm.click();
    }


    public OrdeStorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
