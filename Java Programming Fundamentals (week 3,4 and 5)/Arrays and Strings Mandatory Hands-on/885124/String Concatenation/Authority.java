import java.util.*;

public class Authority {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inmanteName,inmateFatherName;
		
		System.out.println("Inmate's name:");
		inmanteName = sc.nextLine();
		
		System.out.println("Inmate's father's name:");
		inmateFatherName = sc.nextLine();
		
		
		if(inmanteName.matches("[A-Za-z ]*") && inmateFatherName.matches("[A-Za-z ]*")) {
		System.out.println(inmanteName.toUpperCase()+" "+inmateFatherName.toUpperCase());
		}
		else {
			System.out.println("Invalid name");
		}
	}

}
