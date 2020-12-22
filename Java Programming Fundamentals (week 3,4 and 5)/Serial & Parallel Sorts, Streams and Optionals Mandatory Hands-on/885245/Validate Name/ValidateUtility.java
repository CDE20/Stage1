import java.util.*;
import java.util.regex.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String employeename=sc.nextLine().trim();
        String productname=sc.next();
        if(validateEmployeeName().validateName(employeename))
        {
            System.out.println("Employee name is valid");
        }
        else
        {
            System.out.println("Employee name is invalid");
        }
        if(validateProductName().validateName(productname))
        {
            System.out.println("Product name is valid");
        }
        else
        {
            System.out.println("Product name is invalid");
        }
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        return (String name) ->
        {
            return Pattern.matches("[A-Za-z ]{5,20}",name);
        };
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        return (String name) ->
        {
            return Pattern.matches("[A-Za-z ]{1}[0-9]{5}$",name);
        };
    }
}