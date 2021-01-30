import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class LoginTest {
    LoginDAO d = new LoginDAO();
    Login le = new Login("Vaibhav","vaibhav123");  
       	 
     @Test
     public void testAddingSuccess(){
        le.setUserName("Vaibhav");
        le.getUserName();
        le.setPassword("vaibhav123");
        le.getPassword();
        assertTrue(d.addLogin(le));
     }
    
    @Test
    public void testAddingFailure(){
        assertFalse(d.addLogin(null));
    }
    
    @Test
     public void testDelete(){
        d.addLogin(le);
        assertTrue(d.deleteLogin(le));
     }
    
    @Test
    public void testDeleteFailure(){
        assertFalse(d.deleteLogin(null));
    }
    
}
