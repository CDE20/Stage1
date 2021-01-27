import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {

    
    	    	 
      //Write the code for adding and deleting Login data
    Login login;
    LoginDAO loginDao = new LoginDAO();
    
    @Test 
    public void testAddLogin_nullLogin() {
        login = null;
        assertFalse(loginDao.addLogin(login));
    }
 
      
    @Test 
    public void testDeleteLogin_nullLogin() {
        login = null;
        assertFalse(loginDao.deleteLogin(login));
    }

    
	@Test 
	public void testAddLoginData_LoginWith2ArgConstructor() {
		login = new Login("Aniruddh", "joshi");
		assertTrue(loginDao.addLogin(login));
	}
  
	@Test 
	public void testDeleteLoginData_LoginWith2ArgConstructor() {
		login = new Login("Aniruddh", "joshi");
		loginDao.addLogin(login);
		assertTrue(loginDao.deleteLogin(login));
	}
  
}

