import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

	// Write the code for adding and deleting Login data
	LoginDAO dao = new LoginDAO();
	@Test
	public void testAddLogin() {
		Login login = new Login("username", "password");
		assertTrue(dao.addLogin(login));
	}

	@Test
	public void testDeleteLogin() {
		Login login = new Login("username", "password");
		dao.addLogin(login);
		assertTrue(dao.deleteLogin(login));
	}

	@Test
	public void testAddLogin_NullLogin() {
		assertFalse(dao.addLogin(null));
	}

	@Test
	public void testDeleteLogin_NullLogin() {
		assertFalse(dao.deleteLogin(null));
	}
}
