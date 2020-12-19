import java.util.*;
public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name=sc.next();
        System.out.println("Gender");
        String gender=sc.next();
        System.out.println("Expected Salary");
        double sal=sc.nextDouble();
        if(sal<10000)
        {
            String str="Registration Failed. Salary cannot be less than 10000.";
            throw new InvalidSalaryException(str);
            
        }
        Candidate c=new Candidate();
        c.setName(name);
        c.setGender(gender);
        c.setExpectedSalary(sal);
        return c;
        
    }
    
    public static void main (String[] args) {
        
       try {
            Candidate c=getCandidateDetails();
            
            System.out.println("Registration Successful");
           
       } catch(InvalidSalaryException ex) {
           System.out.println(ex.getMessage());
       }
        
    }
}