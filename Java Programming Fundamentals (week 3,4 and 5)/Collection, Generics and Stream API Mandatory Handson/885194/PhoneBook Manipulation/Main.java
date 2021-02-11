import java.util.*;

public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        PhoneBook pb=new PhoneBook();
        int op=0;
        do
        {
            System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit ");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Add a Contact:");
                        System.out.println("Enter the First Name: ");
                        String fname=sc.next();
                        System.out.println("Enter the Last Name: ");
                        String lname=sc.next();
                        System.out.println("Enter the Phone no.: ");
                        long phone=sc.nextLong();
                        System.out.println("Enter the Email:");
                        String email=sc.next();
                        Contact c=new Contact(fname,lname,phone,email);
                        pb.addContact(c);
                        break;
                case 2: System.out.println("The contacts in the List are:");
                        List<Contact> l=pb.viewAllContacts();
                        for(Contact cc:l)
                        {
                            System.out.println("First Name: "+cc.getFirstName());
                            System.out.println("Last Name: "+cc.getLastName());
                            System.out.println("Phone No: "+cc.getPhoneNumber());
                            System.out.println("Email: "+cc.getEmailId());
                        }
                        break;
                case 3: System.out.println("Enter the Phone number to search contact:");
                        long number=sc.nextLong();
                        Contact x=pb.viewContactGivenPhone(number);
                        System.out.println("First Name: "+x.getFirstName());
                        System.out.println("Last Name: "+x.getLastName());
                        System.out.println("Phone No: "+x.getPhoneNumber());
                        System.out.println("Email: "+x.getEmailId());
                        break;
                case 4: System.out.println("Enter the Phone number to remove :");
                        long num=sc.nextLong();
                        System.out.println("Do you want to remove the contact(Y/N):");
                        char cx=sc.next().charAt(0);
                        if(cx=='Y')
                        {
                            if(pb.removeContact(num))
                            System.out.println("The contact is succesfully deleted.");
                        }
                        break;
                case 5: op=1;
                        break;
            }
            
        }while(op!=1);
    }    
}