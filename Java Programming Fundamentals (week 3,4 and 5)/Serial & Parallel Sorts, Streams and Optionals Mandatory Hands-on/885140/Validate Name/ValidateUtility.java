import java.util.Scanner;

public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
    	Scanner sc = new Scanner(System.in);
    	String name = sc.nextLine();
    	String pname = sc.nextLine();
    	Validate validate = validateEmployeeName();
    	boolean value = validate.validateName(name);
    	if(value)
    		System.out.println("Employee name is valid");
    	else
    		System.out.println("Employee name is invalid");
    	validate = validateProductName();
    	value = validate.validateName(pname);
    	if(value)
    		System.out.println("Product name is valid");
    	else
    		System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
    	Validate V = (name)->{
    		int size = name.length();
    		if(name.matches("[a-zA-Z\\s]+") && size>=5 && size<=20)
    			return true;
    		else
    			return false;
    		
    	};
    	return V;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
    	Validate V = (name)->{
    		if(name.matches("[a-zA-Z]{1}[0-9]{5}"))  
    			return true;
    		else
    			return false;
    		
    	};
    	return V;
    }
}