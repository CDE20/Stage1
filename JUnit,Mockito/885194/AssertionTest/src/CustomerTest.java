import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer = new Customer(null, "atik", "shaikh", null, 0, "shaikhatikrajjak@gmail.com");

    @Test
    public void testisValidAadharNo_for16digits() {
        assertTrue(Customer.isValidAadharNo("512354832145"));
    }
    
    @Test
    public void testisValidAadharNo_forStartingWith0_1() {
        assertFalse(Customer.isValidAadharNo("012354832145"));
		assertFalse(Customer.isValidAadharNo("162354832145"));
    }
    
    @Test 
    public void testEqualityOfFirstNameAndLastName() {
        assertNotEquals(customer.getFirstName(), customer.getLastName());
    }
    
    @Test 
    public void testEmailId_NotNull() {
        assertNotNull(customer.getEmailId());
    }
}
