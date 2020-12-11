import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Contact C;
		PhoneBook P = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Menu");
			System.out.println("1.Add Contact");
			System.out.println("2.Display all contact");
			System.out.println("3.Search contact by phone");
			System.out.println("4.Remove contact");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
					System.out.println("Add a Contact:");
					System.out.println("Enter the First Name:");
					sc.nextLine();
					String fName = sc.nextLine();
					System.out.println("Enter the Last Name:");
					String lName = sc.nextLine();
					System.out.println("Enter the Phone No.:");
					long phone = sc.nextLong();
					System.out.println("Enter the Email:");
					String email = sc.next();
					C = new Contact(fName,lName,phone,email);
					P.addContact(C);
					break;
			case 2:
					List<Contact> list = P.viewAllContacts();
					System.out.println("The contacts in the List are:");
					for (Contact contact : list) {
						System.out.println("First Name: " + contact.getFirstName());
						System.out.println("Last Name: " + contact.getLastName());
						System.out.println("Phone No.: " + contact.getPhoneNumber());
						System.out.println("Email: " + contact.getEmailId());
					}
					break;
			case 3:
					System.out.println("Enter the Phone number to search contact:");
					phone = sc.nextLong();
					C = P.viewContactGivenPhone(phone);
					System.out.println("The Contact is:");
					System.out.println("First Name:" + C.getFirstName());
					System.out.println("Last Name: " + C.getLastName());
					System.out.println("Phone No,: " + C.getPhoneNumber());
					System.out.println("Email: " + C.getEmailId());
					break;
			case 4:
					System.out.println("Enter the Phone number to remove:");
					phone = sc.nextLong();
					System.out.println("Do you want to remove the contact(Y/N):");
					char response = sc.next().charAt(0);
					if(response == 'Y' || response =='y')
					{
						if(P.removeContact(phone))
							System.out.println("The Contact is succesfully deleted");
					}
					break;
			}
		} while (choice != 5);
	}
}