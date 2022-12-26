package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage{
    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
    private WebElement placeOrderButton;

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

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalAmountLabel;

    @FindBy(how = How.XPATH, using = "(//a[@href='#'])[8]")
    private WebElement deleteItemLink;

    @FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[1]/td[3]")
    private WebElement device1Price;

    @FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[1]/td[2]")
    private WebElement device1Name;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg' or @src='imgs/Lumia_1520.jpg'" +
            "or @src='imgs/Nexus_6.jpg' or @src='imgs/iphone_6.jpg' or @src='imgs/xperia_z5.jpg'" +
            "or @src='imgs/HTC_M9.jpg' or @src='imgs/sony_vaio_5.jpg' or @src='imgs/macbook_air.jpg'" +
            "or @src='imgs/dell.jpg' or @src='imgs/apple_cinema.jpg' or @src='imgs/asusm.jpg']")
    private WebElement device1Image;

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getDeleteItemLink() {
        return deleteItemLink;
    }

    public WebElement getPlaceOrderButton() {
        return placeOrderButton;
    }

    public WebElement getTotalAmountLabel() {
        return totalAmountLabel;
    }

    public WebElement getDevice1Image() {
        return device1Image;
    }

    public WebElement getDevice1Name() {
        return device1Name;
    }

    public WebElement getDevice1Price() {
        return device1Price;
    }
}
