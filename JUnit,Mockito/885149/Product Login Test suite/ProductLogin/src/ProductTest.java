import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {
ProductDAO dao= new ProductDAO();
    @Test
    public void test1()
    {
        Product product= new Product("123","mobile",10000.0);
        dao.addProduct(product);
        assertTrue(dao.deleteProduct(product));
    }
    

    @Test
    public void test2()
    {
        Product product= null;
        dao.addProduct(product);
        assertFalse(dao.deleteProduct(product));
    }
    
    @Test
    public void test3()
    {
        Product product= new Product();
        dao.addProduct(product);
        assertTrue(dao.deleteProduct(product));
    }
}
