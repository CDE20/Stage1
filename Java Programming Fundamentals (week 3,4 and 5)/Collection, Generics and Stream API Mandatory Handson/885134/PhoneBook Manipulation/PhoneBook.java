import java.util.*;
public class PhoneBook
{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    
    public void setPhoneBook(List<Contact> obj)
    {
        phoneBook=obj;
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
        Contact c=new Contact();
        for(Contact c1:phoneBook)
        {
            if(c1.getPhoneNumber()==phoneNumber)
            {
                c=c1;
            }
        }
        
        return c;
    }
    
    public boolean removeContact(long phoneNumber)
    {
        boolean flag=false;
        for(Contact c:phoneBook)
        {
            if(c.getPhoneNumber()==phoneNumber)
            {
                flag=true;
                phoneBook.remove(c);
                break;
            }
        }
        return flag;
    }
}