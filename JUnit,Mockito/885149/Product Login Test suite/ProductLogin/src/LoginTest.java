import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {
    

    //Write the code for adding and deleting Login data
    LoginDAO dao= new LoginDAO();
    Login login1=new Login("","");
    
    @Test
    public void test5()
    {
        login1.setUserName("Abhishek");
        login1.setPassword("Gupta");
        Login login=new Login(login1.getUserName(),login1.getPassword());
        dao.addLogin(login1);
        assertTrue(dao.deleteLogin(login1));
    }
    
	@Test
    public void test1()
    {
        Login login=new Login("abhishek","123");
        dao.addLogin(login);
        assertTrue(dao.deleteLogin(login));
    }
    
    @Test
    public void test2()
    {
        Login login=null;
        dao.addLogin(login);
        assertFalse(dao.deleteLogin(login));
    }
    
}

