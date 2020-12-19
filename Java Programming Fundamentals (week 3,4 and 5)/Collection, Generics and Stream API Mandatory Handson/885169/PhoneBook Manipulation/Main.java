import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        PhoneBook ph=new PhoneBook();
        Contact c=new Contact();
        int ch=0;
        do 
        {
            System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(s.nextLine());
            switch(ch)
            {
                case 1: System.out.println("Add a Contact:");
                        System.out.print("Enter the First Name: ");
                        c.setFirstName(s.nextLine());
                        System.out.print("\nEnter the Last Name: ");
                        c.setLastName(s.nextLine());
                        System.out.print("\nEnter the Phone No.: ");
                        c.setPhoneNumber(Long.parseLong(s.nextLine()));
                        System.out.print("\nEnter the Email: ");
                        c.setEmailId(s.nextLine());
                        ph.addContact(c);
                        break;
                case 2: 
                        System.out.println("The contacts in the List are:");
                        List<Contact>con=ph.viewAllContacts();
                        for(Contact cn:con)
                        {
                            System.out.println("First Name: "+cn.getFirstName());
                            System.out.println("Last Name: "+cn.getLastName());
                            System.out.println("Phone No.: "+cn.getPhoneNumber());
                            System.out.println("Email: "+cn.getEmailId());
                        }
                        break;
                case 3: System.out.print("\nEnter the Phone number to search contact:");
                        long contact=Long.parseLong(s.nextLine());
                        Contact c1=ph.viewContactGivenPhone(contact);
                        System.out.println("The contact is:");
                        System.out.println("Fisrt Name: "+c1.getFirstName());
                        System.out.println("Last Name: "+c1.getLastName());
                        System.out.println("Phone No.: "+c1.getPhoneNumber());
                        System.out.println("Email: "+c1.getEmailId());
                        break;
                case 4: boolean result;
                        System.out.print("\nEnter the Phone number to remove:");
                        long con1=Long.parseLong(s.nextLine());
                        System.out.print("Do you want to remove the contact(Y/N): ");
                        char st=s.next().charAt(0);
                        if(st=='Y')
                        {
                            result=ph.removeContact(con1);
                            if(result)
                            {
                                System.out.println("The contact is successfully deleted.");
                            }
                            else{
                                System.out.println("Contact is not found");
                            }
                        }
                        if(st=='N')
                        {
                            System.out.println("ok");
                        }
                        break;
                case 5: break;
                        
                       
            }
        }while(ch!=5);
    }
}