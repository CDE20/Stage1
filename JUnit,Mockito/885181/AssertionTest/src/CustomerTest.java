import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
    Customer customer = new Customer("214567891239", "priya", "kp",
	                                 "pune",9284479, "priya@gmail.com");
	
	@Test 
	public void testInvalidAadhar(){
	    assertFalse(customer.isValidAadharNo("023456789123"));
	}
	
	@Test 
	public void testValidAadhar(){
	    assertTrue(customer.isValidAadharNo("423456789123"));
	}
	
	@Test 
	public void testFirstAndLastNameNotEqual(){
	    assertNotEquals(customer.getFirstName(), customer.getLastName());
	}
	
	@Test 
	public void testEmailNotNull(){
	    assertNotNull(customer.getEmailId());
	}

}
