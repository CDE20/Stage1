import java.util.Scanner;

public class ValidateUtility
{
   public static void main(String args[])
    {
        //fill code here
		Scanner sc=new Scanner(System.in);
		String employeeName=sc.nextLine();
		String productName=sc.nextLine();
		if(ValidateUtility.validateEmployeeName().validateName(employeeName))
			System.out.println("Employee name is valid");
		else
			System.out.println("Employee name is invalid");
		if(ValidateUtility.validateProductName().validateName(productName))
			System.out.println("Product name is valid");
		else
			System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
    	Validate v1=(name)->{
    		if((name.matches("[a-zA-Z\\s]+"))&&(name.length()>4)&&(name.length()<=20))
    			return true;
    		else 
    			return false;
    	};
    	return v1;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
    	Validate v2=(name)->{
    		if(name.matches("[a-zA-Z]{1}[0-9]{5}"))
    			return true;
    		else 
    			return false;
    	};
    	return v2;
    }
}