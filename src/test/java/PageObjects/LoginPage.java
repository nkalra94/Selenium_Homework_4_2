package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement loginInput;

    @FindBy (xpath = "//*[@id=\"passwd\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement loginPageSingInBtm;

    public void setLogin (String login){
        loginInput.sendKeys(login);
    }

    public void setPassword (String password){
        passwordInput.sendKeys(password);
    }

    public void signInIntoAccount(){
        loginPageSingInBtm.click();
    }


    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
