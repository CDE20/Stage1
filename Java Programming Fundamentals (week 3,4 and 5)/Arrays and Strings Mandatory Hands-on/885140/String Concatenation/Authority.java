import java.util.Scanner;


class Authority {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inmate's name:");
		String name = sc.nextLine();
		System.out.println("Inmate's father's name:");
		String fatherName = sc.nextLine();
		if (name.matches("^[a-zA-Z\\s]+$") && fatherName.matches("^[a-zA-Z\\s]+$")) {
			
			name += " ";
			String fullName = name.concat(fatherName);
			System.out.println(fullName.toUpperCase());
		} 
		else
		{
			System.out.println("Invalid name");
		}
	}
}