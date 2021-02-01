import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {


	 //Write the code for test methods
	 
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
	    public void testDeleteProduct1() {
	        Product product2 = new Product();
	        assertTrue(productDao.addProduct(product2));
	        assertTrue(productDao.deleteProduct(product2));
	    } 
	    
	    @Test 
	    public void testDeleteProduct2() {
	        product = new Product("1","Smartphone",2110.0);
	        product.setProductId("2");
	        product.setProductName("SmartWatch");
	        product.setPrice(1500.123);
	        assertTrue(productDao.addProduct(product));
	        assertTrue(productDao.deleteProduct(product));
	    }
	   
	    
	   
	    
}
