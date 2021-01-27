import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductTest {

	// Write the code for test methods
	ProductDAO dao = new ProductDAO();
	Product p = new Product();
	Product p2 = new Product("10", "Abc", 150.0);

	@Test
	public void deleteproductTestWithNull() {
		assertFalse(dao.deleteProduct(null));
	}

	@Test
	public void addproductTestWithNull() {
		assertFalse(dao.addProduct(null));
	}
	
	@Test
	public void addproductTestWithData() {
		assertTrue(dao.addProduct(p));
	}

	@Test
	public void deleteproductTest() {
		assertFalse(dao.deleteProduct(p));
	}
	
	@Test
	public void addanddeleteproductTest2() {
		p2.setProductId("101");
		p2.setProductName("Prod1");
		p2.setPrice(500);
		dao.addProduct(p2);
		assertTrue(dao.deleteProduct(p2));
	}

	@Test
	public void addproductTestWithConstructorValue() {
		assertTrue(dao.addProduct(p2));
	}
	
	@Test
	public void deleteproductTestWithConstructorValue() {
		assertFalse(dao.deleteProduct(p2));
	}

}
