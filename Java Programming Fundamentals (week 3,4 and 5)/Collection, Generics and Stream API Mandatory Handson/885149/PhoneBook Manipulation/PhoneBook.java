import java.util.*;
public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();
	
	public void setPhoneBook(List<Contact> phoneBook)
	{
		this.phoneBook = phoneBook;
	}
	
	public List<Contact> getPhoneBook()
	{
		return phoneBook;
	}
	
	public void addContact(Contact contactObj)
	{
		phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts()
	{
		return phoneBook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber)
	{
		Contact con = null;
		for(Contact c: phoneBook)
		{
			if(c.getPhoneNumber() == phoneNumber)
			{
				con = c;
				break;
			}
		}
		
		return con;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean flag= false;
		for(Contact c: phoneBook)
		{
			if(c.getPhoneNumber() == phoneNumber)
			{
				phoneBook.remove(c);
				flag = true;
				break;
			}
		}
		return flag;
	}
}