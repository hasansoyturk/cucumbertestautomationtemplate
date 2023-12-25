package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmazonPages;
import util.DriverFactory;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("go Homepage")
    public void goHomepage() {
        AmazonPages.homePage();

    }

    @When("Click accept cookies button")
    public void clickAcceptCookiesButton() {
        AmazonPages.acceptCookies();
    }

    @When("Click search label")
    public void clickSearchLabel() {
        AmazonPages.clickSearchLabel();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProductName();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("Click shipped by Amazon button")
    public void clickShippedByAmazonButton() {
        AmazonPages.clickShippedByAmazonButton();
    }

    @When("Click Apple")
    public void clickApple() {
        AmazonPages.clickApple();

    }

    @When("Click to first product")
    public void clickToFirstProduct() {
        AmazonPages.clickToFirstProduct();
    }

    @When("Click Add to chart")
    public void clickAddToChart() {
        AmazonPages.clickAddToChart();
    }

    @When("Check the cart")
    public void checkTheCart() {
        AmazonPages.checkTheCart();
    }
}
