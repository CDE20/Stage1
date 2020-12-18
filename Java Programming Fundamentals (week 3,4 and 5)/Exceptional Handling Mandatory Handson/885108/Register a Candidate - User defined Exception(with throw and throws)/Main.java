import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        try{
            Candidate c = getCandidateDetails();
            System.out.println("Registration Successful");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Candidate c = new Candidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details\nName");
        c.setName(sc.next());
        System.out.println("Gender");
        c.setGender(sc.next());
        System.out.println("Expected Salary");
        c.setExpectedSalary(sc.nextDouble());
        if(c.getExpectedSalary() < 10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
            //return null;
        }
        return c;
    }
}