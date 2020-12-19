import java.util.*;
import java.util.regex.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String employee=sc.nextLine();
        Validate ven=validateEmployeeName();
        if(ven.validateName(employee))
        System.out.println("Employee name is valid");
        else
          System.out.println("Employee name is invalid");
          
          String product=sc.nextLine();
          Validate vpn=validateProductName();
          if(vpn.validateName(product))
          System.out.println("Product name is valid");
          else
          System.out.println("Product name is invalid");
          sc.close();
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate v=(en) -> {
            boolean flag= Pattern.matches("[a-zA-z ]{5,20}",en);
            return flag;
        };
        return v;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate v1=(pn) -> {
            boolean flag1=Pattern.matches("[a-zA-z][0-9]{5}",pn);
            return flag1;
        };
        return v1;
    }
}