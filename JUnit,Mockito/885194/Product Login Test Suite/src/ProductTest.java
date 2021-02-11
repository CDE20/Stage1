import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

    private Product product = null;
    private ProductDAO productDao = new ProductDAO();
    
    @Test 
    public void testAddProduct_nullProduct() {
        product = null;
        assertFalse(productDao.addProduct(product));
    }
    
    @Test 
    public void testDeleteProduct_nullProduct() {
        product = null;
        assertFalse(productDao.deleteProduct(product));
    }

    @Test 
    public void testDeleteProduct_productWithUnInitializedFields() {
        Product product3 = new Product();
        assertTrue(productDao.addProduct(product3));
        assertTrue(productDao.deleteProduct(product3));
    } 
    
    @Test 
    public void testDeleteProduct_productWtihInitializedFields() {
        product = new Product("1","Iphone",2110.0);
        product.setProductId("2");
        product.setProductName("Redmi");
        product.setPrice(1500.123);
        assertTrue(productDao.addProduct(product));
        assertTrue(productDao.deleteProduct(product));
    }
}
