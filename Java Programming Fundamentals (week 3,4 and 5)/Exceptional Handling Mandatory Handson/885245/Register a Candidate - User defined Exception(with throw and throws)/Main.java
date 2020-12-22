import java.util.Scanner;
public class Main
{
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        Scanner sc=new Scanner(System.in);
        Candidate can=new Candidate();
        System.out.println("Enter the candidate Details\nName");
        can.setName(sc.next());
        System.out.println("Gender");
        can.setGender(sc.next());
        System.out.println("Expected Salary");
        double salary=sc.nextDouble();
        if(salary>=10000)
        {
            can.setExpectedSalary(salary);
        }
        else
        {
            throw new InvalidSalaryException("Registration failed.Salary cannot be less than 10000.");
        }
         return can;
    }
    public static void main(String args[])
    {
        Candidate can=null;
        try 
        {
            can=getCandidateDetails();
            System.out.println("Registration successful");
            
        } 
        catch(InvalidSalaryException e) 
        {
            System.out.println(e.getMessage());
        } 
    }
}