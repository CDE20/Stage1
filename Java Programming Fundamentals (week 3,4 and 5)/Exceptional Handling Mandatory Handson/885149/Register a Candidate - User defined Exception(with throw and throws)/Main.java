import java.util.*;
public class Main{
    
    public static void main(String[] args){
       try{
       Candidate c= Main.getCandidateDetails();
       
       if(c!=null){
           System.out.println("Registration Successfull");
       }
       }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Candidate cd = new Candidate();
        System.out.println("Name");
        cd.setName(sc.nextLine());
        System.out.println("Gender");
        cd.setName(sc.nextLine());
        
            System.out.println("Salary");
            double sal=sc.nextInt();
           // try{
            if(sal<10000){
                throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
               
            }
            else{
                cd.setExpectedSalary(sal);
                return cd;
           }/*
            }catch(InvalidSalaryException e){
                System.out.println(e.getMessage());
                 return null;
            }*/
        
        
        //return null;
        
    }
}