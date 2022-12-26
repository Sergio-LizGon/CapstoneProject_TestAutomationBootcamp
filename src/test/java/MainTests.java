import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import steps.CartSteps;
import steps.DeviceSteps;
import steps.MainSteps;

import java.time.Duration;
import java.util.NoSuchElementException;

public class MainTests extends BaseTest{

    MainSteps mainSteps = new MainSteps(driver);
    DeviceSteps deviceSteps = new DeviceSteps(driver);
    CartSteps cartSteps = new CartSteps(driver);


    @Test (description = "This test evaluates the correct position of the Phones, Laptops and monitors categories", priority = 1)
    public void testGetPhonesPosition(){
        String phonesPosition = mainSteps.getPhonesPosition();
        String laptopsPosition = mainSteps.getLaptopsPosition();
        String monitorsPosition = mainSteps.getMonitorsPosition();
        CustomAssertions.isElementPositionedCorrectly("20",phonesPosition);
        CustomAssertions.isElementPositionedCorrectly("15",laptopsPosition);
        CustomAssertions.isElementPositionedCorrectly("15",monitorsPosition);
        mainSteps.returnHome();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hrefch'])[1]")));
    }

    @Test (description = "This test evaluates products have the correct information", priority = 2)
    public void testProductInformation(){
        mainSteps.selectDeviceMainPage("Galaxy S6");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='imgs/galaxy_s6.jpg' or @src='imgs/Lumia_1520.jpg'" +
                "or @src='imgs/Nexus_6.jpg' or @src='imgs/iphone_6.jpg' or @src='imgs/xperia_z5.jpg'" +
                "or @src='imgs/HTC_M9.jpg' or @src='imgs/sony_vaio_5.jpg' or @src='imgs/macbook_air.jpg'" +
                "or @src='imgs/dell.jpg' or @src='imgs/apple_cinema.jpg' or @src='imgs/asusm.jpg']")));
        String price = deviceSteps.getPrice();
        String description = deviceSteps.getDescription();
        String name = deviceSteps.getName();
        boolean image = deviceSteps.getImage();
        String button = deviceSteps.getAddToCartButton();
        CustomAssertions.isPriceDisplayed(price);
        CustomAssertions.isDescriptionDisplayed(description);
        CustomAssertions.isDeviceNameDisplayed(name);
        CustomAssertions.isImageDisplayed(image);
        CustomAssertions.isAddToCartButtonDisplayed(button);
        deviceSteps.returnHome();
        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hrefch'])[1]")));
    }

    @Test (description = "This test evaluates the browser alert after adding a product to the cart", priority = 3)
    public void testAddToCartButtonAlert() throws InterruptedException {
        mainSteps.selectDeviceMainPage("Nexus 6");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-lg']")));
        deviceSteps.clickAddToCartButton();
        Thread.sleep(2000);
        String alertText = deviceSteps.getAlertText();
        deviceSteps.acceptAlert();
        CustomAssertions.isAlertTextCorrect(alertText);
        deviceSteps.returnHome();
        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hrefch'])[1]")));
    }

    @Test (description = "This test evaluates the Add to Cart Window", priority = 4)
    public void testAddToCartPage() throws InterruptedException {
        mainSteps.selectDeviceMainPage("iPhone 6");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-lg']")));
        deviceSteps.clickAddToCartButton();
        Thread.sleep(2000);
        deviceSteps.acceptAlert();
        deviceSteps.clickCartLink();
        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='#'])[8]")));
        String delete = cartSteps.getDeleteButton();
        String devicePrice = cartSteps.getDevicePrice();
        String deviceName = cartSteps.getDevice1Name();
        String total = cartSteps.getTotalPrice();
        String placeOrder = cartSteps.getPlaceOrderButtonText();
        boolean image = cartSteps.getImage1();
        CustomAssertions.isImageDisplayed(image);
        CustomAssertions.isPlaceOrderButtonDisplayed(placeOrder);
        CustomAssertions.isDeleteButtonDisplayed(delete);
        CustomAssertions.isDeviceNameDisplayed(deviceName);
        CustomAssertions.isCartPriceDisplayed(devicePrice);
        CustomAssertions.isCartPriceDisplayed(total);
        cartSteps.returnHome();
        Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hrefch'])[1]")));
    }
}
