package steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    WebDriver driver;

    public BaseSteps (WebDriver webDriver){
        this.driver = webDriver;
    }
}
