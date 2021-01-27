import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
	@Test 
	
	public void testIsValidAadharNo(){
	    Customer customer=new Customer("41100875486725","mrunal","patil","pune",967943667L,"mrunal@gmail.com");
	    assertTrue(Customer.isValidAadharNo("234562345622"));
	    assertNotEquals(customer.getFirstName(),customer.getLastName());
	    assertNotNull(customer.getEmailId());
	}
	
	

}
