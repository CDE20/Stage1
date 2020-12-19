import java.util.*;

public class ValidateUtility
{
    static String employeeName;
    static String productName;
    public static void main(String args[])
    {
        //fill code here
        Scanner sc = new Scanner(System.in);
        employeeName=sc.nextLine();
        productName=sc.nextLine();
        
        Validate vName=validateEmployeeName();
        if(vName.validateName(employeeName))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
            
        Validate vProduct=validateProductName();
        if(vProduct.validateName(productName))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
        
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        return employeeName -> (employeeName.matches("[a-zA-Z ]+") && employeeName.length()>4 && employeeName.length()<=20)?true:false;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        return productName -> (productName.matches("[a-zA-Z]{1}[0-9]{5}") && productName.length()==6)?true:false;
    }
}