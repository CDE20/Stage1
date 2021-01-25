import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

 //Write the code for test methods
 Product product =new Product();
 ProductDAO productdao = new ProductDAO();
 
 @Test
 public void addproduct()
 {
     product.setPrice(500.0);
     product.setProductId("123");
     product.setProductName("Mobile");
     product.getProductId();
     product.getProductName();
     product.getPrice();
     productdao.addProduct(product);
     assertTrue(productdao.addProduct(product));
     assertFalse(productdao.addProduct(null));
     
 }
 
 @Test
 public void deleteproduct()
 {
     assertFalse(productdao.deleteProduct(product));
     assertFalse(productdao.deleteProduct(null));
 }

}
