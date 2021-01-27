import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
    @Test
    public void aadharCardNoTest() {
        //String aadharCardNo, String firstName, String lastName, String address, long mobileNo,String emailId
	    Customer c=new Customer("987654325656","rutu","abcd","pune",98765432,"a@gmail.com");
		assertTrue(c.isValidAadharNo("987654325656"));
		assertNotEquals(c.getFirstName(),c.getLastName());
		assertNotNull(c.getEmailId());
		
	}
}
