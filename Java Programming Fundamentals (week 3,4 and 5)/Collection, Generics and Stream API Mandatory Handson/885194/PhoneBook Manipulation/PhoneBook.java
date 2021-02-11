import java.util.*;

public class PhoneBook
{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    
    public List<Contact> getPhoneBook()
    {
        return phoneBook;
    }
    
    public void setPhoneBook(List<Contact> phoneBook)
    {
        this.phoneBook=phoneBook;
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
        for(int i=0;i<phoneBook.size();i++)
        {
            Contact x=phoneBook.get(i);
            if(x.getPhoneNumber()==phoneNumber)
            {
                return x;
            }
        }
        return null;
    }
    
    public boolean removeContact(long phoneNumber)
    {
        int size=phoneBook.size();
        for(int i=0;i<phoneBook.size();i++)
        {
            Contact x=phoneBook.get(i);
            if(x.getPhoneNumber()==phoneNumber)
            {
                phoneBook.remove(i);
            }
        }
        if(size==phoneBook.size())
        return false;
        else 
        return true;
    }
}