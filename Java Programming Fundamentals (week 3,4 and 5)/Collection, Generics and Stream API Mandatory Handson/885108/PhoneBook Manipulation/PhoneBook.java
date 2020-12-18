import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	private List<Contact> phoneBook  = new ArrayList<>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts(){
		return phoneBook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		for(Contact c1 : phoneBook) {
			if(c1.getPhoneNumber() == phoneNumber)
				return c1;
		}
		return null;
	}
	
	public boolean removeContact(long phoneNumber) {
		int i  = 0;
		for(Contact c:phoneBook) {
			if(c.getPhoneNumber() == phoneNumber) {
				phoneBook.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
}
