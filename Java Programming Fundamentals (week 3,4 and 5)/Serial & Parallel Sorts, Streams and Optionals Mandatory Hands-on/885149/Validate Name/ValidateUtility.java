//package lambdaDemo;

import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //fill code here
        
        String empname=sc.nextLine();
        String pname=sc.nextLine();
        
        Validate empv = ValidateUtility.validateEmployeeName();
        boolean empstatus = empv.validateName(empname);
        if(empstatus){
        System.out.println("Employee name is valid");
        }
        else{
            System.out.println("Employee name is invalid");
        }
        
        Validate prodv = ValidateUtility.validateProductName();
        boolean prodstatus = prodv.validateName(pname);
        
        if(prodstatus){
        System.out.println("Product name is valid");
        }
        else{
            System.out.println("Product name is invalid");
        }
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate v1=(String s)->{
            int len=s.length();
            boolean flag=false;
            if(len>=5&&len<=20){
                char ch='a';
                for(int i=0;i<len;i++){
                    ch=s.charAt(i);
                    if((Character.isLetter(ch))||ch==' '){
                    	if(ch==' '){
                    		flag=true;
                    	}
                        continue;
                    }
                    else{
                        return false;
                        //break;
                    }
                }
            }
            else{
                return false;
            }
            return true;
            // if(flag){
            // return true;
            // }
            // else{
            // 	return false;
            // }
        };
        return v1;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate v2=(String s)->{
            int l=s.length();
            if(l==6){
            	char f=s.charAt(0);
                if(Character.isLetter(f)){
                    char ch='a';
                    for(int j=1;j<l;j++){
                        ch=s.charAt(j);
                        if(Character.isDigit(ch)){
                            continue;
                        }
                        else{
                        	//System.out.println("digit");
                            return false;
                        }
                    }
                }
                else{
                	//System.out.println("uppercase");
                    return false;
                }
            }
            else{
            	//System.out.println("lenght");
                return false;
            }
            return true;
        };
        return v2;
    }
}













