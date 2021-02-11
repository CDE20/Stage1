import java.util.*;

public class ValidateUtility {
	public static void main(String args[]) {
		// fill code here
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String pname = sc.next();
		Validate v = validateEmployeeName();
		if (v.validateName(name)) {
			System.out.println("Employee name is valid");
		} else {
			System.out.println("Employee name is invalid");
		}
		v = validateProductName();
		if (v.validateName(pname)) {
			System.out.println("Product name is valid");
		} else {
			System.out.println("Product name is invalid");
		}
	}

	public static Validate validateEmployeeName() {
		// fill code here
		String regex = "[a-zA-Z\\s]{5,20}+$";
		Validate v = (name) -> name.matches(regex);
		return v;
	}

	public static Validate validateProductName() {
		// fill code here
		String regex = "[a-zA-Z]{1}[\\d]{5}+$";
		Validate v = (pname) -> pname.matches(regex);
		return v;
	}
}