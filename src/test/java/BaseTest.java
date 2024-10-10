import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest   {
    public WebDriver driver;
    String baseURL = ("https://www.amazon.com.tr");

    @BeforeEach

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("sayfanın başlığı : " + driver.getTitle());
        System.out.println("sayfanın urlsi: " + driver.getCurrentUrl());

    }
    @AfterEach
    public void teardown() {
        if (driver != null) {

        }
    }
}