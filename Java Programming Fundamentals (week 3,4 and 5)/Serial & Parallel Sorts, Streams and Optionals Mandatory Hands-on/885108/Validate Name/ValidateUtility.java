import java.util.Scanner;

public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
    	Scanner sc = new Scanner(System.in);
    	String empName = sc.nextLine(),productName;
    	productName = sc.next();
    	//System.out.println(productName);
    	Validate v = validateEmployeeName();
    	if(v.validateName(empName))
    		System.out.println("Employee name is valid");
    	else 
    		System.out.println("Employee name is invalid");
    	Validate v1 = validateProductName();
    	if(v1.validateName(productName))
    		System.out.println("Product name is valid");
    	else 
    		System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
    	String regex = "[a-zA-Z\\s]{5,20}+$";
    	Validate v = (name) -> name.matches(regex);
    	return v;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
    	String regex = "[a-zA-Z]{1}[\\d]{5}+$";
    	Validate v = (name) -> name.matches(regex);
    	return v;
    }
}