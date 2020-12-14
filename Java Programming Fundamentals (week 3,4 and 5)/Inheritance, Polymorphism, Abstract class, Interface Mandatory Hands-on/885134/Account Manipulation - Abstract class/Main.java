import java.util.*;
public class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int custid=sc.nextInt();
        String name=sc.next();
        String email=sc.next();
        Customer c=new Customer(custid,name,email);
        int accntno=sc.nextInt();
        double bal=sc.nextDouble();
        double minbal=sc.nextDouble();
        Account a=new SavingsAccount(accntno,c,bal,minbal);
        double amt=sc.nextDouble();
        if(a.withdraw(amt))
        {
            System.out.print("\n\n"+a.getBalance());
        }
    }
}