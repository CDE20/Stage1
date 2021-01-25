import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {
    
    Login login= new Login("vaishnavi","vaish12");
    
    LoginDAO logindao = new LoginDAO();
    
    
    
    
    @Test
    public void addlogin()
    {
    //login.setUserName("vaishnavi");
    //login.setPassword("vaish12");
    //login.getUserName();
    //login.getPassword();
    //logindao.addLogin(login);
    
    assertTrue(logindao.addLogin(login));
    assertFalse(logindao.addLogin(null));
    }
    
    @Test
    public void deletelogin()
    {
        assertFalse(logindao.deleteLogin(login));
        assertFalse(logindao.deleteLogin(null));
    }

      
    	    	 
      //Write the code for adding and deleting Login data
  
    

}

