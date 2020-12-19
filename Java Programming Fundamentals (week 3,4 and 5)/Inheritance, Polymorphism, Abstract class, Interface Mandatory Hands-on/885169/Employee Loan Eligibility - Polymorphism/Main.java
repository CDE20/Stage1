import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        String b=sc.nextLine();
        double c=Double.parseDouble(sc.nextLine());
        double d=Double.parseDouble(sc.nextLine());
        int e=Integer.parseInt(sc.nextLine());
        int f=Integer.parseInt(sc.nextLine());
        Employee e1=new PermanentEmployee(a,b,d);
        e1.calculateSalary();
        Employee e2=new TemporaryEmployee(a,b,e,f);
        Loan l=new Loan();
        l.calculateLoanAmount(e1);
        l.calculateLoanAmount(e2);
       
    }
    
}