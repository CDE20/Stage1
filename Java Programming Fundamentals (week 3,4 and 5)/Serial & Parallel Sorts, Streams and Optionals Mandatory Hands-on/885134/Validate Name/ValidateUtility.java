import java.util.*;

public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
       Scanner sc=new Scanner(System.in);
        
        String name=sc.nextLine();
        
        if(ValidateUtility.validateEmployeeName().validateName(name))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
            
        String product=sc.nextLine();
        
        if(ValidateUtility.validateProductName().validateName(product))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
        
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate validate1= (name)->{
            boolean flag;
            if(name.matches("[a-zA-Z ]{5,20}"))
                return true;
		    else
		        return false;
		};
		return validate1;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate validate2= (name)->{
            if(name.matches("[a-zA-Z]{1}[0-9]{5}"))
                return true;
		    else
		        return false;
		};
		return validate2;
    }
}