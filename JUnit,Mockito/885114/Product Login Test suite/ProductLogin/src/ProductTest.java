import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

	// Write the code for test methods
	ProductDAO dao = new ProductDAO();

	@Test
	public void testAddProduct_WithDefaultConstructor() {
		Product Product = new Product();
		assertTrue(dao.addProduct(Product));
	}

	@Test
	public void testDeleteProduct_WithDefaultConstructor() {
		Product Product = new Product();
		dao.addProduct(Product);
		assertTrue(dao.deleteProduct(Product));
		assertFalse(dao.deleteProduct(Product));
	}

	@Test
	public void testAddProduct_NullProduct() {
		assertFalse(dao.addProduct(null));
	}

	@Test
	public void testDeleteProduct_NullProduct() {
		assertFalse(dao.deleteProduct(null));
	}

	@Test
	public void testAddProduct_With3ArgsConstructor() {
		Product product = new Product("1", "phone", 10000.0);
		assertTrue(dao.addProduct(product));
	}

	@Test
	public void testDeleteProduct_With3ArgsConstructor() {
		Product product = new Product("1", "MacBook", 120000.0);
		product.setProductId("2");
		product.setProductName("MacBook Pro");
		product.setPrice(160000);
		dao.addProduct(product);
		assertTrue(dao.deleteProduct(product));
	}
	
	@Test 
	public void testDeleteProduct_ProductNotPresentInTheList() {
		Product product = new Product("1", "MacBook", 120000.0);
		assertFalse(dao.deleteProduct(product));
		
		product = new Product();
		assertFalse(dao.deleteProduct(product));
	}
}
