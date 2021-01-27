import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

 //Write the code for test methods
 
    Product product = null;
    ProductDAO productDao = new ProductDAO();
    
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
    public void testDeleteProduct_productWithDefaultConstructor() {
        Product product = new Product();
        productDao.addProduct(product);
        assertTrue(productDao.deleteProduct(product));
    } 

    
    @Test 
    public void testAddProduct_productWith3ArgConstructor() {
        product = new Product("1", "Mobile", 20000.0);
        assertTrue(productDao.addProduct(product));
    }
    
    @Test 
    public void testDeleteProduct_productWith3ArgConstructor() {
    	product = new Product("1", "Mobile", 20000.0);
    	product.setProductId("2");
        product.setProductName("TV");
        product.setPrice(30000.0);
    	productDao.addProduct(product);
        assertTrue(productDao.deleteProduct(product));
    }


}
