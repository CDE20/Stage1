import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class LoginTest {
	    	 
    private Login login;
    private LoginDAO loginDao = new LoginDAO();
    
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
    public void testDeleteLogin_loginWtihInitializedFields() {
        login = new Login("atik", "password");
        assertTrue(loginDao.addLogin(login));
        assertTrue(loginDao.deleteLogin(login));
    }
}



