import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
    Customer customer = new Customer("123456789012", "Aniruddh", "Joshi", "Pune", 77987831, "aniruddha.joshi05@gmail.com");
    
    @Test
    public void testIsValidAadharNo_for16Digits(){
        assertTrue(Customer.isValidAadharNo("891234567810"));
    }
    
    @Test 
    public void testIsValidAadharNo_forStartingWith0(){
        assertFalse(Customer.isValidAadharNo("012354890123"));
    }
    
    @Test 
    public void testIsValidAadharNo_forStartingWith1(){
        assertFalse(Customer.isValidAadharNo("112354890123"));
    }
    
    @Test 
    public void testFirstName_LastName_NotEqual(){
        assertNotEquals(customer.getFirstName(),customer.getLastName());
    }
    
    
    @Test 
    public void testEmailId_NotNull() {
        assertNotNull(customer.getEmailId());
    }

}
