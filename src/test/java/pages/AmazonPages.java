package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    static WebDriverWait wait;

    static By accept = By.cssSelector("#sp-cc-accept");
    static By clickSearchLabel = By.cssSelector("#twotabsearchtextbox");
    static By clickSearchButton = By.cssSelector("#nav-search-submit-button");
    static By clickSendByAmazon = By.cssSelector("#p_98\\/21345978031 > span > a > div > label > i");
    static By clickApple = By.cssSelector("#p_89\\/Apple > span > a > div > label > i");
    static By clickFirstProduct = By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > span > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-v1mco1mcsyt2as2cus6ux4x8tmr > span > a > div > img");
    static By clickAddToChart = By.cssSelector("#add-to-cart-button");
    static By clickToChart = By.cssSelector("#nav-cart-count-container");
    static By checkTheProduct = By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);

    }


    public static void homePage() {
    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }

    public static void clickSearchLabel() {
        elementHelper.click(clickSearchLabel);
    }

    public static void writeProductName() {
        //elementHelper.findElement(clickSearchLabel).sendKeys("Airpods");
        elementHelper.sendKey(clickSearchLabel,"Airpods");
    }

    public static void clickSearchButton() {
        elementHelper.click(clickSearchButton);
    }

    public static void clickShippedByAmazonButton() {
        elementHelper.click(clickSendByAmazon);
    }

    public static void clickApple() {
        elementHelper.click(clickApple);
    }

    public static void clickToFirstProduct() {
        elementHelper.click(clickFirstProduct);
    }

    public static void clickAddToChart() {
        elementHelper.click(clickAddToChart);
    }

    public static void checkTheCart() {
        elementHelper.click(clickToChart);
        elementHelper.checkProduct(checkTheProduct);
    }
}
