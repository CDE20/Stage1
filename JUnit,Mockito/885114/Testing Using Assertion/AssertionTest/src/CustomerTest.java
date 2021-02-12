
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {
	// Write the code for testing assertion using JUNIT
	@Test
	public void testAadharCardNo() {
		assertTrue(Customer.isValidAadharNo("232323232323")); // 12 digits and doesn't start wit 0 or 1
		assertFalse(Customer.isValidAadharNo("23232323232")); // isn't 12 digits
		assertFalse(Customer.isValidAadharNo("010101010101")); // starts with 0 
		assertFalse(Customer.isValidAadharNo("110101010101")); // starts with 1
	}
	
	@Test
	public void testFirstNameLastName() {
		Customer customer = new Customer("2323232323232323", "first", "last", null, 0, null);
		assertNotEquals(customer.getFirstName(), customer.getLastName());
	}
	
	@Test
	public void testEmailId() {
		Customer customer = new Customer("2323232323232323", "first", "last", null, 0, "email@gmail.com");
		assertNotNull(customer.getEmailId());
	}
}
