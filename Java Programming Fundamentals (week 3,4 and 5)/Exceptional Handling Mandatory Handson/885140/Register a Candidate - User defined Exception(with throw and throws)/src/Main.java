import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Candidate C = getCandidateDetails();
			if(C !=null)
				System.out.println("Registration Successful.");
		} catch (InvalidSalaryException e) {
				System.out.println(e);
		}

	}
	
	public static Candidate getCandidateDetails() throws InvalidSalaryException {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the candidate Details");
	System.out.println("Name");
	String name = sc.nextLine();
	System.out.println("Gender");
	String gender = sc.next();
	System.out.println("Expected Salary");
	double salary = sc.nextDouble();
	if(salary< 10000) {
		throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
	}
	
	Candidate C = new Candidate();
	C.setName(name);
	C.setGender(gender);
	C.setExpectedSalary(salary);
	return C;

}
}
