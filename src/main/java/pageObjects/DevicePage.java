package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import steps.DeviceSteps;

public class DevicePage extends BasePage{
    public DevicePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg']")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[1]")
    private WebElement homeLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[2]")
    private WebElement contactLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[3]")
    private WebElement aboutUsLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[4]")
    private WebElement cartLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[5]")
    private WebElement logInLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[8]")
    private WebElement signUpLink;

    @FindBy(how = How.XPATH, using = "//h2[@class='name']")
    private WebElement deviceName;

    @FindBy(how = How.XPATH, using = "//h3[@class='price-container']")
    private WebElement devicePrice;

    @FindBy(how = How.XPATH, using = "//div[@id='more-information']")
    private WebElement deviceDescription;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg' or @src='imgs/Lumia_1520.jpg'" +
            "or @src='imgs/Nexus_6.jpg' or @src='imgs/iphone_6.jpg' or @src='imgs/xperia_z5.jpg'" +
            "or @src='imgs/HTC_M9.jpg' or @src='imgs/sony_vaio_5.jpg' or @src='imgs/macbook_air.jpg'" +
            "or @src='imgs/dell.jpg' or @src='imgs/apple_cinema.jpg' or @src='imgs/asusm.jpg']")
    private WebElement deviceImage;

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getDeviceDescription() {
        return deviceDescription;
    }

    public WebElement getDeviceName() {
        return deviceName;
    }

    public WebElement getDevicePrice() {
        return devicePrice;
    }

    public WebElement getDeviceImage() {
        return deviceImage;
    }
}