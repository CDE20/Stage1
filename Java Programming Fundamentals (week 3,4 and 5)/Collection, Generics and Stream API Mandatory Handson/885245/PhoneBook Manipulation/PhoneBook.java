import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class PhoneBook
{
    private List<Contact> phoneBook;
    public PhoneBook()
    {
        phoneBook=new ArrayList<Contact>();
    }
    public void setPhoneBook(List<Contact>phoneBook)
    {
        this.phoneBook=phoneBook;
    }
    public List<Contact> getPhoneBook()
    {
        return this.phoneBook;
    }
    public void addContact(Contact contactobj)
    {
        this.phoneBook.add(contactobj);
    }
    public List<Contact> viewAllContacts()
    {
        return this.phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber)
    {
        for(Contact c:this.phoneBook)
        {
            if(c.getPhoneNumber()==phoneNumber)
            {
                return c;
            }
        }
            return null;
    }
    public boolean removeContact(long phoneNumber)
    {
        for(Contact c: this.phoneBook)
        {
            if(c.getPhoneNumber() == phoneNumber)
            {
                return this.phoneBook.remove(c);
            }
        }
        return false;
    }
}