import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

 //Write the code for test methods
    private Product product = null;
    private ProductDAO productDao = new ProductDAO();
    @Test
    public void testProductOne()
    {
        product = new Product("1","Iphone",2110.0);
        product.setProductId("2");
        product.setProductName("Redmi");
        product.setPrice(1500.123);
        assertTrue(productDao.addProduct(product));
        assertTrue(productDao.deleteProduct(product));
    }
    @Test
    public void testProductTwo()
    {
        product = null;
        assertFalse(productDao.addProduct(product));
    }
    @Test
    public void testProductThree()
    {
        product = null;
        assertFalse(productDao.deleteProduct(product));
    }
        @Test
    public void testProductFour()
    {
        Product product3 = new Product();
        assertTrue(productDao.addProduct(product3));
        assertTrue(productDao.deleteProduct(product3));
    }
}
