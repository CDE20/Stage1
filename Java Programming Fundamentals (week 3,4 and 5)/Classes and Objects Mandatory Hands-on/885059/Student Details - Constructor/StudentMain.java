import java.util.*;

public class StudentMain
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        //sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String option = sc.next();
        do {
            
            if(option.equalsIgnoreCase("NO"))
            {
                sc.nextLine();
                System.out.println("Enter the college name:");
                String college = sc.nextLine();
                System.out.println(id+" "+name+" "+address+" "+college);
            }
            else if(option.equalsIgnoreCase("YES"))
            {
                System.out.println(id+" "+name+" "+address);
            }
        } while(!(option.equalsIgnoreCase("YES") || option.equalsIgnoreCase("NO")) );
    }
}