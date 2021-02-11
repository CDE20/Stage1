import java.util.Scanner;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
	    Scanner sc = new Scanner(System.in);
	    Candidate candidate = new Candidate();
	    System.out.println("Enter the candidate Details");
	    System.out.println("Name");
	    String name = sc.next();
	    candidate.setName(name);
	    System.out.println("Gender");
	    String gender = sc.next();
	    candidate.setGender(gender);
	    System.out.println("Expected Salary");
	    double salary = sc.nextDouble();
	    candidate.setExpectedSalary(salary);
	    if (salary < 10000) {
    	   throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
    	} 
	    System.out.println("Registration Successful");
	    return candidate;
	}
	
    public static void main(String[] args) {
        try {
            Candidate candidate = Main.getCandidateDetails();
        } catch(InvalidSalaryException e) {
	        System.out.println(e.getMessage());
	    }
    }
}