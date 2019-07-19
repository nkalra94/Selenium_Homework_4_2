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
    AddressPage addressPage;
    MySPage mySPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    OrdeStorePage ordeStorePage;
    WomanMPage womanMPage;
    WebDriver driver;




    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkalra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkalra\\Downloads\\Midterm\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        myStorePage = new MyStorePage(driver);
        addressPage = new AddressPage(driver);
        mySPage = new MySPage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        ordeStorePage = new OrdeStorePage(driver);
        womanMPage = new WomanMPage(driver);



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

        @And("^goes to the women clothes$")
    public void goesToTheWomenClothes() {
        myAccountPage.goToWomenCloses();

    }


    @And("^choosing a clothes$")
    public void choosingAClothes() {
        womanMPage.selectRandomCloses();

    }


    @And("^selecting black color of the product$")
    public void selectingBlackColorOfTheProduct() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mySPage.selectBlackColorOfTheBlouse();

    }

    @And("^adding the product to the cart$")
    public void addingTheProductToTheCart()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mySPage.addToCart();
    }


    @And("^proceeding to checkout from the product page$")
    public void proceedingToCheckoutFromTheProductPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mySPage.proceedingToCheckoutFromTheBlousePage();
    }

    @And("^proceeding to checkout from the summary page$")
    public void proceedingToCheckoutFromTheSummaryPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ordeStorePage.proceedToCheckoutFromSummary();

    }

    @And("^clicks on update to change the delivery address$")
    public void clicksOnUpdateToChangeTheDeliveryAddress() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ordeStorePage.updateTheDeliveryAddress();

    }

    @And("^fills the address field$")
    public void fillsTheAddressField() {
        addressPage.setAddressFieldInput("1435 w Sacramento blvd");

    }

    @And("^fills the city field$")
    public void fillsTheCityField() {
        addressPage.setCityFieldInput("San Francisco");

    }

    @And("^select a state$")
    public void selectAState() {
        addressPage.setStateSelectInput("California");

    }

    @And("^fills the postcode field$")
    public void fillsThePostcodeField() {
        addressPage.setPostCodeInput("60015");

    }

    @And("^save changes$")
    public void saveChanges() {
        addressPage.saveAddressChanging();

    }

    @And("^proceed to checkout from address page$")
    public void proceedToCheckoutFromAddressPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ordeStorePage.proceedToCheckoutFromAddress();

    }

    @And("^agree to terms of service$")
    public void agreeToTermsOfService() {
        ordeStorePage.agreeWithTerms();

    }

    @And("^proceed to checkout from shipping page$")
    public void proceedToCheckoutFromShippingPage() {
        ordeStorePage.proceedToCheckoutFromShipping();

    }

    @And("^select to pay by check method$")
    public void selectToPayByCheckMethod() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ordeStorePage.payByCheckOption();

    }

    @And("^confirming the order$")
    public void confirmingTheOrder() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ordeStorePage.confirmOrder();

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
