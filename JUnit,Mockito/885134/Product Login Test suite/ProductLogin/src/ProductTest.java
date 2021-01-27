import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

 //Write the code for test methods
    Product p1=new Product("101","pack",120.0);
    ProductDAO product=new ProductDAO();
    
    @Test
	public void deleteproduct_test() {
	    p1.setProductId("1");
	     p1.setProductName("product");
	     p1.setPrice(10);
	     p1.getProductId();
	      p1.getProductName();
	     p1.getPrice();
	    product.addProduct(p1);
		assertTrue(product.deleteProduct(p1));
	}
	
    @Test
	public void deleteproductifnull_test() {
		assertFalse(product.deleteProduct(null));
	}
    @Test
	public void addproduct_test() {
		assertTrue(product.addProduct(p1));
	}
	
    @Test
	public void addproductifnull_test() {
		assertFalse(product.addProduct(null));
	}
}
