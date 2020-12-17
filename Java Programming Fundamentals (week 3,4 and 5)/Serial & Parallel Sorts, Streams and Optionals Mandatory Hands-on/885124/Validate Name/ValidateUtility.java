import java.util.Scanner;

public class ValidateUtility
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	String firstName,productName;
    	firstName=sc.nextLine();
    	productName=sc.nextLine();
    	ValidateUtility vu = new ValidateUtility();
    	Validate v1=vu.validateEmployeeName();
    	boolean ans = v1.validateName(firstName);
    	if(ans) {
    		System.out.println("Employee name is valid");
    	}
    	else {
    		System.out.println("Employee name is invalid");
    	}
    
    	
    	Validate v2 = vu.validateProductName();
    	boolean ans1 = v2.validateName(productName);
    	if(ans1) {
    		System.out.println("Product name is valid");
    	}
    	else {
    		System.out.println("Product name is invalid");
    	}
    	
    }
    
    public static Validate validateEmployeeName() 
    {
    	Validate validate = (n)->{
    		if(n.matches("[a-zA-Z\\s]{5,20}") ) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	};
    	
    	
    	return validate;
    
    }
    
    public static Validate validateProductName() 
    {
    	Validate validate = (n)->{
    		if(n.matches("[A-Za-z][0-9]{5}") ) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	};
    	
    	
    	return validate;
    }
}