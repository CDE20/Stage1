import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		PhoneBook ph = new PhoneBook();
		do {
				System.out.print("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit\nEnter your choice: ");
				choice = sc.nextInt();
				switch(choice) {
					case 1:System.out.println("Add a Contact");
					String f_name,l_name,email;
					long phone;
					System.out.print("Enter the First Name:");f_name = sc.next();
					System.out.print("Enter the Last Name:");l_name = sc.next();
					System.out.print("Enter the Phone No.:");phone = sc.nextLong();
					System.out.print("Enter the Email:");email = sc.next();
					Contact c = new Contact(f_name, l_name, phone, email);
					ph.addContact(c);
						break;
					case 2:System.out.println("The contacts in the List are:");
					for(Contact obj: ph.getPhoneBook()) {
						System.out.println("First Name: "+obj.getFirstName());
						System.out.println("Last Name: "+obj.getLastName());
						System.out.println("Phone No.: "+obj.getPhoneNumber());
						System.out.println("Email: "+obj.getEmailId());
					}
						break;
					case 3:System.out.print("Enter the Phone number to search contact:");
					long contact = sc.nextLong();
					System.out.println("The contact is:");
					Contact c_obj = ph.viewContactGivenPhone(contact);
					System.out.println("First Name:"+c_obj.getFirstName()+"\nLast Name:"+c_obj.getLastName()+"\nPhone No.:"+c_obj.getPhoneNumber()+"\nEmail:"+c_obj.getEmailId());
						break;
					case 4:System.out.print("Enter the Phone number to remove:");
					long phoneNo = sc.nextLong();
					char choose;
					System.out.print("Do you want to remove the contact(Y/N):");choose = sc.next().charAt(0);
					if(choose == 'Y') {
						if(ph.removeContact(phoneNo))
							System.out.println("The contact is successfully deleted.");
					}
						break;
					case 5:
						break;
			}
		}while(choice != 5);
	}

}
