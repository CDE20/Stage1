import java.util.Scanner;
import java.util.regex.Pattern;
public class Authority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Inmate's name:");
		String name = sc.nextLine();
		System.out.print("Inmate's father's name:");
		String fathers_name = sc.nextLine();
		if(name.matches("^[ A-Za-z]+$") && fathers_name.matches("^[ A-Za-z]+$")){
			String concatenated = name+" "+fathers_name;
			System.out.println(concatenated);
		}
		else{
			System.out.println("Invalid name");
		}
		sc.close();
	}

}
