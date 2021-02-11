import java.util.Scanner;

public class Authority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inmate's name: ");
        String name = sc.nextLine();
        System.out.print("Inmate's father's name: ");
        String fname = sc.nextLine();
        if (name.matches("[A-Za-z\\s]+") && fname.matches(("[A-Za-z\\s]+"))) {
            System.out.println(name.toUpperCase() + " " + fname.toUpperCase());
        } else if (!name.matches("[A-Za-z\\s]+")) {
            System.out.println("Invalid name");
        } else if (!fname.matches(("[A-Za-z\\s]+"))) {
            System.out.println("Invalid name");
        }
    }
}