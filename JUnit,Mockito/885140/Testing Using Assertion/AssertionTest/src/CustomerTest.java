import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT

	@Test
	public void testAadharCard1() {
		//Customer C = new Customer("299999999999","Nakul","Sanap","Manmad",9999999,"abc@gmail.com");
		assertTrue(Customer.isValidAadharNo("299999999999"));
	}
	
	@Test
	public void testAadharCard2() {
		
		assertTrue(Customer.isValidAadharNo("099999999999"));
	}
	
	@Test
	public void testAadharCard3() {
		assertTrue(Customer.isValidAadharNo("299999999"));
	}
	
	@Test
	public void testFirstAndLastName() {
		Customer C = new Customer("299999999999","Nakul","Sanap","Manmad",9999999,"abc@gmail.com");
		assertNotEquals(C.getFirstName(),C.getLastName());
	}
	
	@Test
	public void testEmailNotNull() {
		Customer C = new Customer("299999999999","Nakul","Sanap","Manmad",9999999,"abc@gmail.com");
		assertNotNull(C.getEmailId());
	}
}
