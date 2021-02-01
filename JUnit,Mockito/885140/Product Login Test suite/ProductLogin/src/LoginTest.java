import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {

      
    	    	 
	 
//Write the code for adding and deleting Login data
private LoginDAO dao = new LoginDAO();
private Login login;

@Test
public void testAddLoginNull(){
   login = null;
   assertFalse(dao.addLogin(login));
}

@Test
public void testDeleteLoginNull(){
   login = null;
   assertFalse(dao.deleteLogin(login));
}

@Test
public void testAddAndDeleteLogin(){
   login = new Login("Nakul","Pass");
   assertTrue(dao.addLogin(login));
   assertTrue(dao.deleteLogin(login));
}



}

