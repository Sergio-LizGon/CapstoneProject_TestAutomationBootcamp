package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LaptopsPage;
import pageObjects.MainPage;
import pageObjects.MonitorsPage;
import pageObjects.PhonesPage;

public class MainSteps extends BaseSteps{

    MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
    PhonesPage phonesPage = PageFactory.initElements(driver,PhonesPage.class);
    LaptopsPage laptopsPage = PageFactory.initElements(driver,LaptopsPage.class);
    MonitorsPage monitorsPage = PageFactory.initElements(driver,MonitorsPage.class);
    public MainSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectDeviceMainPage(String device) {
        switch (device) {
            case "Galaxy S6":
                mainPage.getGalaxyS6Link().click();
                break;
            case "Lumia 1520":
                mainPage.getLumia1520Link().click();
                break;
            case "Nexus 6":
                mainPage.getNexus6Link().click();
                break;
            case "Galaxy S7":
                mainPage.getGalaxyS7Link().click();
                break;
            case "iPhone 6":
                mainPage.getIphone6Link().click();
                break;
            case "Xperia Z5":
                mainPage.getXperiaZ5Link().click();
                break;
            case "HTC One":
                mainPage.getHtcOneM9Link().click();
                break;
            case "Vaio i5":
                mainPage.getSonyVaio_i5Link().click();
                break;
            case "Vaio i7":
                mainPage.getSonyVaio_i7Link().click();
                break;
            default:
                mainPage.getHomeLink().click();
                break;
        }
    }

    public void selectDevicePhonesPage(String device) {
        switch (device) {
            case "Galaxy S6":
                phonesPage.getGalaxyS6Link().click();
                break;
            case "Lumia 1520":
                phonesPage.getLumia1520Link().click();
                break;
            case "Nexus 6":
                phonesPage.getNexus6Link().click();
                break;
            case "Galaxy S7":
                phonesPage.getGalaxyS7Link().click();
                break;
            case "iPhone 6":
                phonesPage.getIphone6Link().click();
                break;
            case "Xperia Z5":
                phonesPage.getXperiaZ5Link().click();
                break;
            case "HTC One":
                phonesPage.getHtcOneM9Link().click();
                break;
            default:
                phonesPage.getPhonesCategory().click();
                break;
        }
    }

    public void selectDeviceLaptopsPage(String device){
        switch (device){
            case "Vaio i5":
                laptopsPage.getSonyVaio_i5Link().click();
                break;
            case "Vaio i7":
                laptopsPage.getSonyVaio_i7Link().click();
                break;
            case "MacBook Air":
                laptopsPage.getMacBookAirLink().click();
                break;
            case "Dell i7":
                laptopsPage.getDell_i7Link().click();
                break;
            case "Dell 2017":
                laptopsPage.getDell2017Link().click();
                break;
            case "MacBook Pro":
                laptopsPage.getMacBookProLink().click();
                break;
            default:
                laptopsPage.getLaptopsCategory().click();
                break;
        }
    }

    public void selectDeviceMonitorsPage(String device){
        switch (device){
            case "Apple Monitor":
                monitorsPage.getAppleMonitorLink().click();
                break;
            case "ASUS Full":
                monitorsPage.getAsusFullLink().click();
                break;
            default:
                monitorsPage.getMonitorsCategory().click();
                break;
        }
    }

    public String getPhonesPosition(){
        return mainPage.getGalaxyS6Link().getAttribute("offsetLeft");
    }

    public String getLaptopsPosition(){
        return mainPage.getLaptopsCategory().getAttribute("offsetLeft");
    }

    public String getMonitorsPosition(){
        return mainPage.getMonitorsCategory().getAttribute("offsetLeft");
    }

    public void returnHome(){
        mainPage.getHomeLink().click();
    }


}
