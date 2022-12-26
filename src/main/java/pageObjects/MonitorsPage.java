package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonitorsPage extends BasePage{
    public MonitorsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "(//a[@id='itemc'])[1]")
    private WebElement phonesCategory;

    @FindBy(how = How.XPATH, using = "(//a[@id='itemc'])[2]")
    private WebElement laptopsCategory;

    @FindBy(how = How.XPATH, using = "(//a[@id='itemc'])[3]")
    private WebElement monitorsCategory;

    @FindBy(how = How.XPATH, using = "(//a[@id='cat'])[1]")
    private WebElement categoriesButton;

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

    @FindBy(how = How.ID, using = "prev2")
    private WebElement previousButton;

    @FindBy(how = How.ID, using = "next2")
    private WebElement nextButton;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[1]")
    private WebElement appleMonitorLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[2]")
    private WebElement asusFullLink;

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getPreviousButton() {
        return previousButton;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getMonitorsCategory() {
        return monitorsCategory;
    }

    public WebElement getCategoriesButton() {
        return categoriesButton;
    }

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getLaptopsCategory() {
        return laptopsCategory;
    }

    public WebElement getPhonesCategory() {
        return phonesCategory;
    }

    public WebElement getAppleMonitorLink() {
        return appleMonitorLink;
    }

    public WebElement getAsusFullLink() {
        return asusFullLink;
    }
}
