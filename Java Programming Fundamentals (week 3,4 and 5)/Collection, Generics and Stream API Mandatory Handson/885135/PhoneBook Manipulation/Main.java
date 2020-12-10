import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		PhoneBook phoneBook=new PhoneBook();
		do {
			
			System.out.println("Menu\n" + 
					"\n" + 
					"1.Add Contact\r\n" + 
					"\n" + 
					"2.Display all contacts\r\n" + 
					"\n" + 
					"3.Search contact by phone \r\n" + 
					"\n" + 
					"4.Remove contact\r\n" + 
					"\n" + 
					"5.Exit\r\n" + 
					"\n" + 
					"Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Add a Contact:\n");
				System.out.println("Enter the First Name:");
				String firstName=sc.next();
				System.out.println("Enter the Last Name:");
				String lastName=sc.next();
				System.out.println("Enter the Phone No.:");
				long phoneNumber=sc.nextLong();
				System.out.println("Enter the Email:");
				String emailId=sc.next();
				Contact c=new Contact(firstName, lastName, phoneNumber, emailId);
				phoneBook.addContact(c);
				break;
			case 2:
				System.out.println("The contacts in the List are:\n");
				List<Contact> list=phoneBook.viewAllContacts();
				for(Contact obj: list) {
					System.out.println("First Name: "+obj.getFirstName()+"\nLast Name: "+obj.getLastName()
					+"\nPhone No.: "+obj.getPhoneNumber()+"\nEmail: "+obj.getEmailId());
				}
				break;
			case 3:
				System.out.println("Enter the Phone number to search contact:");
				long phone=sc.nextLong();
				Contact contact=phoneBook.viewContactGivenPhone(phone);
				System.out.println("First Name: "+contact.getFirstName()+"\nLast Name: "+contact.getLastName()
					+"\nPhone No.: "+contact.getPhoneNumber()+"\nEmail: "+contact.getEmailId());
				break;
			case 4:
				System.out.println("Enter the Phone number to remove :");
				long number=sc.nextLong();
				System.out.println("Do you want to remove the contact (Y/N):");
				char ans=sc.next().charAt(0);
				if(ans=='Y') {
					if(phoneBook.removeContact(number))
						System.out.println("The contact is successfully deleted.");
				}
				break;
			}
			
		}while(choice!=5);
	}
}
