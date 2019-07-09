package StepDefinitions;

import PageObjects.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    MyStorePage myStorePage;
    AddressMyStorePage addressMyStorePage;
    BlouseMyStorePage blouseMyStorePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    OrderMyStorePage orderMyStorePage;
    WomanMyStorePage womanMyStorePage;
    WebDriver driver;




    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "c:\\Vika testing\\SELENIUM!\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        myStorePage = new MyStorePage(driver);
        addressMyStorePage = new AddressMyStorePage(driver);
        blouseMyStorePage = new BlouseMyStorePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        orderMyStorePage = new OrderMyStorePage(driver);
        womanMyStorePage = new WomanMyStorePage(driver);



    }
    @Given("^shopper navigates to the page$")
    public void shopperNavigatesToThePage() {
        driver.get("http://automationpractice.com/index.php");

    }

    @When("^shopper clicks signIn button$")
    public void shopperClicksSignInButton() {
        myStorePage.signIn();
    }

    @And("^filling the email$")
    public void fillingTheEmail() {
        loginPage.setLogin("Rviko131@gmail.com");

    }

    @And("^filling the password$")
    public void fillingThePassword() {
        loginPage.setPassword("qwerty131");

    }

    @And("^clicking sign in$")
    public void clickingSignIn() {
        loginPage.signInIntoAccount();

    }

    @And("^goes to the women closes$")
    public void goesToTheWomenCloses() {

        myAccountPage.goToWomenCloses();

    }

    @And("^choosing a closes$")
    public void choosingACloses()  {
        womanMyStorePage.selectRandomCloses();

    }

    @And("^selecting black color of the product$")
    public void selectingBlackColorOfTheProduct() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        blouseMyStorePage.selectBlackColorOfTheBlouse();

    }

    @And("^adding the product to the cart$")
    public void addingTheProductToTheCart()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        blouseMyStorePage.addToCart();
    }


    @And("^proceeding to checkout from the product page$")
    public void proceedingToCheckoutFromTheProductPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        blouseMyStorePage.proceedingToCheckoutFromTheBlousePage();
    }

    @And("^proceeding to checkout from the summary page$")
    public void proceedingToCheckoutFromTheSummaryPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderMyStorePage.proceedToCheckoutFromSummary();

    }

    @And("^clicks on update to change the delivery address$")
    public void clicksOnUpdateToChangeTheDeliveryAddress() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderMyStorePage.updateTheDeliveryAddress();

    }

    @And("^fills the address field$")
    public void fillsTheAddressField() {
        addressMyStorePage.setAddressFieldInput("1435 w Sacramento blvd");

    }

    @And("^fills the city field$")
    public void fillsTheCityField() {
        addressMyStorePage.setCityFieldInput("San Francisco");

    }

    @And("^select a state$")
    public void selectAState() {
        addressMyStorePage.setStateSelectInput("California");

    }

    @And("^fills the postcode field$")
    public void fillsThePostcodeField() {
        addressMyStorePage.setPostCodeInput("60015");

    }

    @And("^save changes$")
    public void saveChanges() {
        addressMyStorePage.saveAddressChanging();

    }

    @And("^proceed to checkout from address page$")
    public void proceedToCheckoutFromAddressPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderMyStorePage.proceedToCheckoutFromAddress();

    }

    @And("^agree to terms of service$")
    public void agreeToTermsOfService() {
        orderMyStorePage.agreeWithTerms();

    }

    @And("^proceed to checkout from shipping page$")
    public void proceedToCheckoutFromShippingPage() {
        orderMyStorePage.proceedToCheckoutFromShipping();

    }

    @And("^select to pay by check method$")
    public void selectToPayByCheckMethod() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderMyStorePage.payByCheckOption();

    }

    @And("^confirming the order$")
    public void confirmingTheOrder() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderMyStorePage.confirmOrder();

    }

    @Then("^the order is complete$")
    public void theOrderIsComplete() {
        WebElement orderConfirmation  = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
        String expectedMessage = "Your order on My Store is complete.";
        Assert.assertEquals(expectedMessage, orderConfirmation.getText());
    }

    @After
    public void closing(){
        driver.quit();
    }


}
