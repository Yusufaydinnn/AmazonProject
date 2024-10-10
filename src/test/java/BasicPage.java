import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicPage {

    public WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());


    public BasicPage(WebDriver driver) {
        this.driver = driver;

    }

    public void acceptTheProduct() {
        driver.findElement(By.id("sp-cc-accept")).click();

    }

    public void searchTheProduct() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);

    }

    public void selectTheProduct() {
        driver.findElement(By.xpath("//img[@alt='ASUS TUF F15 - FX507ZC4-HN211W Gaming Dizüstü Bilgisayar,15.6 inç, 12. Nesil Intel® Core™ i5-12500H Islemci 2.5 GHz, 512 G...']")).click();
        logger.info("merhaba");
    }

    public void lookTheProduct() {
        driver.findElement(By.xpath("//span[.='Daha fazla göster']")).click();
        logger.info("özelliklere bakıldı ");
    }

    public void addToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
        logger.info(" bilgisayar sepete eklendi ");
    }

    public void searchMouse() {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mouse", Keys.ENTER);
    }

    public void clickMouse() {
        driver.findElement(By.xpath("//img[@alt='Sponsorlu Reklam - Razer DeathAdder V3 Pro - Hafif Kablosuz Ergonomik Espor Faresi (63g Hafif Tasarım, Focus Pro 30K Optik...']")).click();
    }

    public void addToCartMouse() {
        driver.findElement(By.id("add-to-cart-button")).click();
        logger.info("mouse sepete eklendi ");
    }
    public void proceedToRetailCheckout() {
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout'")).click();
        logger.info("siparişi tamamlaya tıklandı");

    }
}