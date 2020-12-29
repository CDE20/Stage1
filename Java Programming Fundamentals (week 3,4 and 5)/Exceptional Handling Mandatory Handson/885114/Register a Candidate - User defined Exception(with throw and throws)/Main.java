import java.util.Scanner;

public class Main { 
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Candidate candidate = new Candidate();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        candidate.setName(sc.nextLine());
        
        System.out.println("Gender");
        candidate.setGender(sc.nextLine());
        
        System.out.println("Expected Salary");
        double salary = 0;
        
        salary = Double.parseDouble(sc.nextLine());
        if (salary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
            
        candidate.setExpectedSalary(salary);
        
        return candidate;
    }
    
    public static void main (String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            if (candidate != null) 
                System.out.println("Registration Successful");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
}