import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        PhoneBook pb=new PhoneBook();
        while(true){
            System.out.print("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit\nEnter the choice: ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.print("Add a Contact:\nEnter the First Name: ");
                String fname=sc.next();
                System.out.print("Enter the Last Name: ");
                String lname=sc.next();
                System.out.print("Enter the Phone No.: ");
                long ph=sc.nextLong();
                System.out.print("Enter the Email: ");
                String mail=sc.next();
                Contact c=new Contact(fname,lname,ph,mail);
                pb.addContact(c);
            }
            if(ch==2)
            {
                if(pb.getPhoneBook().isEmpty())
                    System.out.println("The List is Empty");
                else    
                    System.out.println("The contacts in the List are:");
                for(Contact c:pb.getPhoneBook()){
                    System.out.println("First Name: "+c.getFirstName()+"\nLast Name: "+c.getLastName()+"\nPhone No.: "+c.getPhoneNumber()+"\nEmail: "+c.getEmailId());
                }
            }
            if(ch==3)
            {
                System.out.print("Enter the Phone number to search contact:");
                Contact c=pb.viewContactGivenPhone(sc.nextLong());
                if(c!=null)
                    System.out.println("First Name: "+c.getFirstName()+"\nLast Name: "+c.getLastName()+"\nPhone No.: "+c.getPhoneNumber()+"\nEmail: "+c.getEmailId());
                else
                    System.out.println("Contact not found");
            }
            else if(ch==4)
            {
                System.out.print("Enter the Phone number to remove:");
                long ph=sc.nextLong();
                System.out.print("Do you want to remove the contact(Y/N):");
                char choice=sc.next().charAt(0);
                if(choice=='Y'){
                    if(pb.removeContact(ph))
                        System.out.println("The contact is successfully deleted.");
                    else
                        System.out.println("Contact Not Found.");
                }
            else if(ch==5)
                {break;}
            else    
                System.out.println("Wrong Choice! Please Enter a valid choice.");
            }
        }
    }
}