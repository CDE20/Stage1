import java.util.Scanner;

public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
    	Scanner sc = new Scanner(System.in);
    	String employeeName = sc.nextLine();
    	
    	String productName = sc.nextLine();
    	
    	Validate validateEmployeeName = ValidateUtility.validateEmployeeName();
    	if (validateEmployeeName.validateName(employeeName))
    		System.out.println("Employee name is valid");
    	else 
    		System.out.println("Employee name is invalid");
    	
    	Validate validateProductName = ValidateUtility.validateProductName();
    	if (validateProductName.validateName(productName)) 
    		System.out.println("Product name is valid");
    	else 
    		System.out.println("Product name is invalid");

    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
    	Validate v = i -> {
    			 
			return i.matches("^[a-zA-Z\\s]{5,20}$");
    	};
    	
    	return v;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
    	Validate v = i -> {
    		return i.matches("^[a-zA-Z]{1}[0-9]{5}$");
    	};
    	
    	return v;
    }
}