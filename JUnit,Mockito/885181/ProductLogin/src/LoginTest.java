import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {
    	    	 
    //Write the code for adding and deleting Login data
     Login login = new Login("priya", "priya22");
    LoginDAO logindao = new LoginDAO();
   
    // Adding login data
    @Test 
    public void testLoginDAOaddLoginforNullObject() {
        assertFalse(logindao.addLogin(null));
    }
    
    @Test 
    public void testLoginDAOaddLoginforNotNullObject() {
        assertTrue(logindao.addLogin(login));
    }
    
    // Deleting login data
    @Test 
    public void testLoginDAOdeleteLoginforNullObject() {
        assertFalse(logindao.deleteLogin(null));
    }
    
    @Test 
    public void testLoginDAOdeleteExistingLoginforNotNullObject() {
        logindao.addLogin(login);
        assertTrue(logindao.deleteLogin(login));
    }
    
    // Deleting non existing login data
    @Test 
    public void testLoginDAO_deleteNonExistingLogin_NotNullObject() {
        assertFalse(logindao.deleteLogin(login));
    }
    
    // Deleting non existing login data by altering its attributes
   @Test 
    public void testLoginDAO_deleteNonExistingLogin_AlterUsernameAndPassword() {
        login.setUserName("");
        login.setPassword("");
        assertFalse(logindao.deleteLogin(login));
    } 
    
}

