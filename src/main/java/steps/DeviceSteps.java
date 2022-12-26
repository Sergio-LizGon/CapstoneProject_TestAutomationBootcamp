package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import pageObjects.DevicePage;
import pageObjects.MainPage;

public class DeviceSteps extends BaseSteps{

    DevicePage devicePage = PageFactory.initElements(driver, DevicePage.class);
    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    public DeviceSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public String getPrice(){
        return devicePage.getDevicePrice().getText();
    }

    public String getDescription(){
        return devicePage.getDeviceDescription().getText();
    }

    public String getName(){
        return devicePage.getDeviceName().getText();
    }

    public boolean getImage(){
        return devicePage.getDeviceImage().isEnabled();
    }

    public String getAddToCartButton(){
        return devicePage.getAddToCartButton().getText();
    }

    public void clickAddToCartButton(){
        devicePage.getAddToCartButton().click();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickCartLink(){
        devicePage.getCartLink().click();
    }

    public void returnHome(){
        devicePage.getHomeLink().click();
    }


}
