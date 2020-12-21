import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		try {
			Candidate c=Main.getCandidateDetails();
			System.out.println("Registration Successful");
		}catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static Candidate getCandidateDetails() throws InvalidSalaryException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the candidate Details");
		Candidate c=new Candidate();
		System.out.println("Name");
		c.setName(sc.next());
		System.out.println("Gender");
		c.setGender(sc.next());
		System.out.println("Expected Salary");
		c.setExpectedSalary(sc.nextDouble());
		if(c.getExpectedSalary()<10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
			
		}
		return c;
	}
}
