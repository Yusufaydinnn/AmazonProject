import org.junit.jupiter.api.Test;

public class TestCase extends BaseTest {

    @Test
    public void test02() {

        BasicPage basicPage = new BasicPage(driver);

        basicPage.acceptTheProduct();
        basicPage.searchTheProduct();
        basicPage.selectTheProduct();
        basicPage.lookTheProduct();
        basicPage.addToCart();
        basicPage.searchMouse();
        basicPage.clickMouse();
        basicPage.addToCartMouse();
        basicPage.proceedToRetailCheckout();


    }
}
