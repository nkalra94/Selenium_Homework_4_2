package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyStorePage {


        @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
        private WebElement signInButton;

        public void signIn (){
            signInButton.click();
        }

        public MyStorePage (WebDriver driver){
            PageFactory.initElements(driver, this);
        }

}
