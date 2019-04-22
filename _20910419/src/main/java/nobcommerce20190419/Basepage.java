package nobcommerce20190419;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Basepage {

    protected static WebDriver driver;

    //Under this annotation will be executed in each test case
    @Before
    //Used to start browser before running test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\nobcommerce20190419\\Webdriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //set the implicit wait for the WebDriver object instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get the registration webpage
        driver.get("https://demo.nopcommerce.com");
    }
}
