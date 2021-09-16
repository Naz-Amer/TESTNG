package Base;

import Pages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    public WebDriver driver;
    //String Url = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx";

    @BeforeSuite
    @Parameters({"browser", "url"})
    public void setDriver(String browser, String app) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }


        driver.get(app);

    }


    @AfterSuite
    public void closeUp(){
        driver.close();
        driver.quit();
    }
}
