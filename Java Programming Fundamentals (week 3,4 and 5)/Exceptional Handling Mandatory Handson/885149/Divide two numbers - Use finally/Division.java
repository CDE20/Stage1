import java.util.*;
public class Division{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        sc.nextLine();
        int num2=sc.nextInt();
        Division divide = new Division();
        String str=divide.divideTwoNumbers(num1,num2);
        System.out.println(str);
    }
    public String divideTwoNumbers(int number1,int number2){
        String msg="Thanks for using the application.";
        try{
        if(number2==0){
            
            throw new ArithmeticException();
        }
        else{
            int result=number1/number2;
            msg="The answer is "+result+"."+msg;
        }
        }catch(ArithmeticException e){
            msg="Division by zero is not possible."+msg;
        }
        finally{
            return msg;
        }
    }
}