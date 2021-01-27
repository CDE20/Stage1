import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
public class CustomerTest {
   Customer obj;
   
    @Test
    public void testValidateAadhar(){
    		assertTrue(obj.isValidAadharNo("912345678904"));        
  }
   
    @Test
    public void testNotValidateAadhar(){
    		assertFalse(obj.isValidAadharNo("112345678904"));        
  }
  
    
    @Test
    public void testFirstName_LastName_NotEqual() {
    	obj=new Customer("", "vaibhav", "vibhandik","", 123, "");
    	assertNotEquals(obj.getFirstName(), obj.getLastName());
    }

    @Test
    public void testEmailIdNotNull() {
    	obj=new Customer("", "vaibhav", "vibhandik","", 123, "vai123@gmail.com");
    	assertNotNull(obj.getEmailId());
    }

    
}
