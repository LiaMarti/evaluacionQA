package Steps;

import Configurations.WebDriverFactory;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PruebaTecnicaSteps {
    private WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    OverviewPage overviewPage;

    @Given("the user in (.*) on (.*) ")
    public void userInPage(String page, String navigator){
        driver = WebDriverFactory.Browser(navigator, page);
        loginPage = new LoginPage(driver);
    }

    @Then("Then the user search (.*) ")
   public void UserTypesproduct(String product) throws InterruptedException {
        checkoutPage = new SearchPage(driver);
        checkoutPage.inputTextWithoutZipCode(product);
    }

   /* @And("go to search")
    public void ClickTosearch(){
        inventoryPage = new InventoryPage(driver);
        inventoryPage.Clicksearch();
    }*/

     @And("go to selectfirstresult")
    public void Clicktfirtsresult(){
        inventoryPage = new ReportPage(driver);
        inventoryPage.Clickfirtsresult();
    }
    @Then ("Validate (.*)")
        public void UserTypesproduct(String car) throws InterruptedException {
        checkoutPage = new SearchCar(driver);
        checkoutPage.inputTextWithoutZipCode(car);
    }

    

}