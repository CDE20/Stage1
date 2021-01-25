import org.junit.Assert;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
	@Test
	public void testCustomer() {
	    Customer customer = new Customer("423456789098","vaishnavi","kolte","pune",9890476767L,"as@gmail.com");
	    String Firstname=customer.getFirstName();
	    String lastname=customer.getLastName();
	    String email=customer.getEmailId();
	    //String adharno = "4234567890987654";
	    assertNotEquals(Firstname,lastname);
	    assertNotNull(email);
	    assertTrue(customer.isValidAadharNo("423456789098"));
	    
	}

}
