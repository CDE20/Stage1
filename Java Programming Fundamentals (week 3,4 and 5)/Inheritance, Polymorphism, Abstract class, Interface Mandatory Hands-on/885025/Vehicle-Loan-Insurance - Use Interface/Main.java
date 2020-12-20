import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Vehicle v= new Vehicle("a12","honda","2 wheeler",50000);
      System.out.println("Loan amount: "+v.issueLoan());
      System.out.println("Insurance amount: "+v.takeInsurance());
      
    }
}