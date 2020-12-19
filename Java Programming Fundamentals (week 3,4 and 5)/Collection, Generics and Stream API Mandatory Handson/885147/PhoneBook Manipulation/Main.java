import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        PhoneBook pb = new PhoneBook();
        int flag=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Add Contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search contact by phone");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Add a Contact:");
                    System.out.println("Enter the First Name:");
                    String firstName=sc.nextLine();
                    System.out.println("Enter the Last Name:");
                    String lastName=sc.nextLine();
                    System.out.println("Enter the Phone No.:");
                    long phoneNumber=sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter the Email:");
                    String emailId=sc.nextLine();
                    Contact ct = new Contact(firstName,lastName,phoneNumber,emailId);
                    pb.addContact(ct);
                    break;
              case 2:
            	    List<Contact> list = pb.viewAllContacts();
            	    System.out.println("The contacts in the List are:");
            	    for(Contact c:list) {
            	    	System.out.println("First Name: "+c.getFirstName());
            	    	System.out.println("Last Name: "+c.getLastName());
            	    	System.out.println("Phone No.: "+c.getPhoneNumber());
            	    	System.out.println("Email: "+c.getEmailId());
            	    }
            	    break;
              case 3: 	    
            	  System.out.println("Enter the Phone number to search contact:");
            	  long number = sc.nextLong();
            	  Contact c = pb.viewContactGivenPhone(number);
            	  System.out.println("The contact is:");
            	  System.out.println("First Name: "+c.getFirstName());
      	    	  System.out.println("Last Name: "+c.getLastName());
      	    	  System.out.println("Phone No.: "+c.getPhoneNumber());
      	    	  System.out.println("Email: "+c.getEmailId());
            	  break;
             case 4:
            	  System.out.println("Enter the Phone number to remove : ");
            	  long num = sc.nextLong();
            	  System.out.println("Do you want to remove the contact(Y/N):");
            	  String ch=sc.next();
            	  if(ch.equalsIgnoreCase("Y")) {
            		  pb.removeContact(num);
            		  System.out.println("The contact is successfully deleted.");
            	  }
            	  break;
            case 5:
            	  flag=1;
            	  break;
            }
        }while(flag!=1);
    }
}
