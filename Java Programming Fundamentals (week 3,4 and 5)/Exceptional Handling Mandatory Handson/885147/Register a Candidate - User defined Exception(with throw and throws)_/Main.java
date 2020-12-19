import java.util.*;

public class Main{
    
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc=new Scanner(System.in);
        Candidate c = new Candidate();
        System.out.println("Enter the candidate Details");
        System.out.println("Name\n");
        String name=sc.next();
        System.out.println("Gender\n");
        String gender=sc.next();
        System.out.println("Expected Salary");
        double expectedSalary=sc.nextDouble();
        
        if(expectedSalary < 10000)
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        
        c.setName(name);
        c.setGender(gender);
        c.setExpectedSalary(expectedSalary);
        
        return c;
    }
    
    public static void main(String args[]){
        try{
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}