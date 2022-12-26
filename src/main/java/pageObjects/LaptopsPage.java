package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaptopsPage extends BasePage{
    public LaptopsPage(WebDriver webDriver) {
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
    private WebElement sonyVaio_i5Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[2]")
    private WebElement sonyVaio_i7Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[3]")
    private WebElement macBookAirLink;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[4]")
    private WebElement dell_i7Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[5]")
    private WebElement dell2017Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[6]")
    private WebElement macBookProLink;

    public WebElement getPhonesCategory() {
        return phonesCategory;
    }

    public WebElement getLaptopsCategory() {
        return laptopsCategory;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getCategoriesButton() {
        return categoriesButton;
    }

    public WebElement getMonitorsCategory() {
        return monitorsCategory;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getPreviousButton() {
        return previousButton;
    }

    public WebElement getSonyVaio_i7Link() {
        return sonyVaio_i7Link;
    }

    public WebElement getSonyVaio_i5Link() {
        return sonyVaio_i5Link;
    }

    public WebElement getDell2017Link() {
        return dell2017Link;
    }

    public WebElement getDell_i7Link() {
        return dell_i7Link;
    }

    public WebElement getMacBookAirLink() {
        return macBookAirLink;
    }

    public WebElement getMacBookProLink() {
        return macBookProLink;
    }
}
