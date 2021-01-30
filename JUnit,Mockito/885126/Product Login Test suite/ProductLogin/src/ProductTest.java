import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class ProductTest {
    ProductDAO p = new ProductDAO();
    Product pro = new Product("123","gulabjam",123);  
       	 
     @Test
     public void testAddingSuccess(){
         
     pro.setProductId("123");
     pro.setProductName("gulabjam");
     pro.setPrice(123);
     
assertTrue(p.addProduct(pro));
}
    
    @Test
    public void testAddingFailure(){
        assertFalse(p.addProduct(null));
   }
    
    @Test
     public void testDelete(){
        p.addProduct(pro);
        assertTrue(p.deleteProduct(pro));
     }
   
    @Test
    public void testDeleteFailure(){
        assertFalse(p.deleteProduct(null));
    }
    
}




