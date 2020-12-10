import java.util.Scanner;

public class Authority {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmate's name:");
		String inmateName=sc.nextLine();
		
		System.out.println("Inmate's father's name:");
		String fatherName=sc.nextLine();
		if(inmateName.matches("[a-zA-Z\\s]+")&&fatherName.matches("[a-zA-Z\\s]+"))
			System.out.println(inmateName.concat(" ").concat(fatherName).toUpperCase());
		else
			System.out.println("Invalid name");
		
	}
	
}
