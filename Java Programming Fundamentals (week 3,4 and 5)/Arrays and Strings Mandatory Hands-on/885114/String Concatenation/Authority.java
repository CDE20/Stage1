import java.util.Scanner;

public class Authority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fathersName = sc.nextLine();
        
        String output = name.concat(" ").concat(fathersName).toUpperCase();
        
        if (output.matches("^[a-zA-Z ]*$")) {
            System.out.println(output);
        }
        else {
        	System.out.println("Invalid name");
        };
        
    }
}