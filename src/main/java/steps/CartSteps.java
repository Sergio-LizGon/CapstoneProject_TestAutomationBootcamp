package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CartPage;

public class CartSteps extends BaseSteps{

    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);

    public CartSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTotalPrice(){
        return cartPage.getTotalAmountLabel().getText();
    }

    public String getDevicePrice(){
        return cartPage.getDevice1Price().getText();
    }

    public String getDevice1Name(){
        return cartPage.getDevice1Name().getText();
    }

    public boolean getImage1(){
        return cartPage.getDevice1Image().isEnabled();
    }

    public String getDeleteButton(){
        return cartPage.getDeleteItemLink().getText();
    }

    public void clickDeleteButton(){
        cartPage.getDeleteItemLink().click();
    }

    public String getPlaceOrderButtonText(){
        return cartPage.getPlaceOrderButton().getText();
    }

    public void returnHome(){
        cartPage.getHomeLink().click();
    }
}
