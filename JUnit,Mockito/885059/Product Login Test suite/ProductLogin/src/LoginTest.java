import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {

	// Write the code for adding and deleting Login data
	Login login = new Login("Shubham", "1234");
	LoginDAO dao = new LoginDAO();

	@Test
	public void methoddeleteNullLoginTest() {
		assertFalse(dao.deleteLogin(null));
	}

	@Test
	public void methodaddNullLoginTest() {
		assertFalse(dao.addLogin(null));
	}

	@Test
	public void methodaddLoginTest() {
		assertTrue(dao.addLogin(login));
	}

	@Test
	public void methoddeleteLoginTestWithEmptyList() {
		assertFalse(dao.deleteLogin(login));
	}

}
