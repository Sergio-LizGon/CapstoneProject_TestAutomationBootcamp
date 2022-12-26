package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhonesPage extends BasePage{
    public PhonesPage(WebDriver webDriver) {
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
    private WebElement galaxyS6Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[2]")
    private WebElement lumia1520Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[3]")
    private WebElement nexus6Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[4]")
    private WebElement galaxyS7Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[5]")
    private WebElement iphone6Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[6]")
    private WebElement xperiaZ5Link;

    @FindBy(how = How.XPATH, using = "(//a[@class='hrefch'])[7]")
    private WebElement htcOneM9Link;

    public WebElement getXperiaZ5Link() {
        return xperiaZ5Link;
    }

    public WebElement getPreviousButton() {
        return previousButton;
    }

    public WebElement getNexus6Link() {
        return nexus6Link;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getLumia1520Link() {
        return lumia1520Link;
    }

    public WebElement getIphone6Link() {
        return iphone6Link;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getHtcOneM9Link() {
        return htcOneM9Link;
    }

    public WebElement getGalaxyS7Link() {
        return galaxyS7Link;
    }

    public WebElement getGalaxyS6Link() {
        return galaxyS6Link;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getCategoriesButton() {
        return categoriesButton;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getLaptopsCategory() {
        return laptopsCategory;
    }

    public WebElement getMonitorsCategory() {
        return monitorsCategory;
    }

    public WebElement getPhonesCategory() {
        return phonesCategory;
    }
}
