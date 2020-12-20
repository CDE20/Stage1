import java.util.*;
import java.util.regex.*;

public class ValidateUtility
{
    static String ename = "";
    static String pname = "";
    public static void main(String args[])
    {
        //fill code here
        Scanner sc = new Scanner(System.in);
        
        ValidateUtility.ename = sc.nextLine();
        ValidateUtility.pname = sc.nextLine();
        Validate ven = ValidateUtility.validateEmployeeName();
        boolean b = ven.validateName(ValidateUtility.ename);
        if(b)
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        Validate vpn = ValidateUtility.validateProductName();
        boolean c = vpn.validateName(ValidateUtility.pname);
        if(c)
            System.out.println("Product name is valid");
        else 
            System.out.println("Product name is invalid");
        
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate en = (ename) -> Pattern.matches("([a-zA-Z\\s]{5,20})",ename);
        return en;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        
        Validate pn = (pname) -> Pattern.matches("([a-zA-Z][0-9]{5})",pname);
        return pn;
    }
}