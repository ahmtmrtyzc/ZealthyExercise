package src.test.testbase;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import src.test.utils.ConfigsReader;
import src.test.utils.Constants;

public class BaseClass {


    public static WebDriver driver;

    public static void setUp()  {
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        String browser = ConfigsReader.getProperty("browser");

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
        driver.manage().window().maximize();
        String website = ConfigsReader.getProperty("url");
        driver.get(website);

        PageInitializer.initialize();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
