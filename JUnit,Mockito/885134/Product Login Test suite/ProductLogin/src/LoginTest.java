import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {

      
    	    	 
      //Write the code for adding and deleting Login data
    Login user1=new Login("rutu","1234");
	LoginDAO login=new LoginDAO();
	
    @Test
	public void deletelogin_test() {
	    user1.setUserName("user");
	    user1.setPassword("pass");
	  // user1.getUserName();
	   //user1.getPassword();
	    login.addLogin(user1);
		assertTrue(login.deleteLogin(user1));
	}
    @Test
	public void deleteloginifnull_test() {
		assertFalse(login.deleteLogin(null));
	}
	@Test
	public void addlogin_test() {
		assertTrue(login.addLogin(user1));
	}
    @Test
	public void addloginifnull_test() {
		assertFalse(login.addLogin(null));
	}
}

