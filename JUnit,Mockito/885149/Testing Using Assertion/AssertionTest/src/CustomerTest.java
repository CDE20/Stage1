import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
	Customer cust = new Customer("312345678923","Arun","Malik", "Banaglaore", 98765432L,"arummalik@cogniaznt.com");
	
	Customer invalidcust = new Customer("0345678923","Arun","Arun", "Banaglaore", 98765432L,null);
	
	@Test
	public void testValidAdhaarNumber(){
	    Assert.assertTrue(cust.isValidAadharNo("312345678923"));
	}
	
	@Test
	public void testInValidAdhaarNumber(){
	    Assert.assertFalse(cust.isValidAadharNo("012345678923"));
	}
	
	@Test
	public void testInValidAdhaarNumber_NumberofDigits(){
	    Assert.assertFalse(cust.isValidAadharNo("2345678923"));
	}
	
	@Test
	public void testFirstNameNotEqualsLastName(){
	    Assert.assertNotEquals(cust.getFirstName(),cust.getLastName());
	}
	
	@Test
	public void testEmailIdNotNull(){
	    Assert.assertNotNull(cust.getEmailId());
	}
	

}
