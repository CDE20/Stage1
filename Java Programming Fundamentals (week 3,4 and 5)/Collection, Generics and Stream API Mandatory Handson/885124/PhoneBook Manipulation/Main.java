import java.util.Scanner;

public class Main {

                public static void main(String[] args) {

                                Scanner sc = new Scanner(System.in);
                                int n;
                                Contact c;
                                PhoneBook p = new PhoneBook();
                                
                                do{
                                                System.out.println("Menu/n1.Add Contact/n2.Display all contacts/n3.Search contact by phone/n4.Remove contact/n5.Exit/nEnter your choice:");
                                                n = sc.nextInt();
                                                sc.nextLine();
                                                
                                                switch (n) {
                                                case 1:
                                                                c = new Contact();
                                                                System.out.println("Add a Contact:");
                                                                System.out.println("Enter the First Name: ");
                                                                c.setFirstName(sc.nextLine());
                                                                System.out.println("Enter the Last Name: ");
                                                                c.setLastName(sc.nextLine());
                                                                System.out.println("Enter the Phone No.: ");
                                                                c.setPhoneNumber(sc.nextLong());
                                                                sc.nextLine();
                                                                System.out.println("Enter the Email: ");
                                                                String email = sc.next();
                                                                c.setEmailId(sc.nextLine());
                                                                break;
                                                case 2:
                                                                System.out.println("The contacts in the List are:");
                                                                for (Contact c1 : p.viewAllContacts()) {
                                                                                System.out.println("First Name: "+c1.getFirstName());
                                                                                System.out.println("Last Name: "+c1.getLastName());
                                                                                System.out.println("Phone No.: "+c1.getPhoneNumber());
                                                                                System.out.println("Email: "+c1.getEmailId());
                                                                }
                                                                break;
                                                case 3:
                                                                System.out.println("Enter the Phone number to search contact:");
                                                                long phone = sc.nextLong();
                                                                sc.nextLine();
                                                                System.out.println("The contact is:");
                                                                System.out.println("First Name: "+p.viewContactGivenPhone(phone).getFirstName());
                                                                System.out.println("Last Name: "+p.viewContactGivenPhone(phone).getLastName());
                                                                System.out.println("Phone No.: "+p.viewContactGivenPhone(phone).getPhoneNumber());
                                                                System.out.println("Email: "+p.viewContactGivenPhone(phone).getEmailId());
                                                                break;
                                                case 4:
                                                                System.out.println("Enter the Phone number to remove :");
                                                                long remove = sc.nextLong();
                                                                sc.nextLine();
                                                                System.out.println("Do you want to remove the contact (Y/N): ");
                                                                String ch = sc.nextLine();
                                                                if(ch.equals("Y")){
                                                                                p.removeContact(remove);
                                                                }
                                                                break;
                                                case 5:
                                                                System.exit(0);
                                                }
                                }while(n<=5);
                }

}
