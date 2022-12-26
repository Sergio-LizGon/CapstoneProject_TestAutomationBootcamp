import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver = getDriver();

    private WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/sl0822/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeTest (alwaysRun = true)
    public void beforeTest() throws InterruptedException {
        Thread.sleep(2000);
    }
    @AfterTest(alwaysRun = true)
    public void afterTest(){
        driver.close();
    }

}
