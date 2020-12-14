import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        int id=sc.nextInt();
        String name=sc.next();
        double pay=sc.nextDouble();
        
        Employee e=new PermanentEmployee(id,name,pay);
        e.calculateSalary();
        Loan l=new Loan();
        l.calculateLoanAmount(e);
       
    }
    
}