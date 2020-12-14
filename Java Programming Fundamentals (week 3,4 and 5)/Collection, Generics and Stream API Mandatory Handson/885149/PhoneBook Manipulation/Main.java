import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		PhoneBook book = new PhoneBook();
		Contact c;
		do {
			System.out.println(
					"Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit\nEnter your choice");
			option = sc.nextInt();
			switch (option) {
			case 1: // Add Contact
				System.out.println("Add a Contact:");
				System.out.println("Enter the First Name:");
				String fname = sc.next();
				System.out.println("Enter the Last Name:");
				String lname = sc.next();
				System.out.println("Enter the Phone No.:");
				long phno = sc.nextLong();
				System.out.println("Enter the Email:");
				String email = sc.next();
				c = new Contact(fname, lname, phno, email);
				book.addContact(c);
				break;

			case 2: // Display All
				System.out.println("The contacts in the List are:");
				for (Contact con : book.viewAllContacts()) {
					System.out.println("First Name: " + con.getFirstName());
					System.out.println("Last Name: " + con.getLastName());
					System.out.println("Phone No.: " + con.getPhoneNumber());
					System.out.println("Email: " + con.getEmailId());
				}
				break;
			case 3: //Search
				System.out.println("Enter the Phone number to search contact:");
				long phone = sc.nextLong();
				Contact con = book.viewContactGivenPhone(phone);
				System.out.println("The contact is:");
				System.out.println("First Name: " + con.getFirstName());
				System.out.println("Last Name: " + con.getLastName());
				System.out.println("Phone No.: " + con.getPhoneNumber());
				System.out.println("Email: " + con.getEmailId());
				break;
			case 4: //remove
				System.out.println("Enter the Phone number to search contact:");
				long phoneRmv = sc.nextLong();
				System.out.println("Do you want to remove the contact (Y/N):");
				String bool = sc.next();
				if(bool.equals("Y"))
				{
					if(book.removeContact(phoneRmv))
						System.out.println("The contact is successfully deleted.");
				}
					
			}
		} while (option != 5);
	}
}