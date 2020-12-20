import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Loan l=new Loan();
        PermanentEmployee pe=new PermanentEmployee(1,"abc",60000);
        TemporaryEmployee te=new TemporaryEmployee(12,"xyz",12,3000);
        pe.calculateSalary();
        te.calculateSalary();
        System.out.println("PermanentEmployee loan amount:  "+l.calculateLoanAmount(pe));
        System.out.println("TemporaryEmployee loan amount:  "+l.calculateLoanAmount(te));
        
       
    }
    
}