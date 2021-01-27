import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {

      
    private Login login;
    private LoginDAO loginDao = new LoginDAO();
    @Test
    public void testAddLogin()
    {
        login = null;
        assertFalse(loginDao.addLogin(login));
        assertFalse(loginDao.deleteLogin(login));
        login = new Login("amith","987654321");
        login.setUserName("aakash");
        login.setPassword("123456");
        assertTrue(loginDao.addLogin(login));
        assertTrue(loginDao.deleteLogin(login));
        
    }
  
    

}

