import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.ArrayIndexOutOfBoundsException;
public class ArrayException{
    public static void main(String args[]){
        System.out.println(new ArrayException().getPriceDetails());
    }
    public String getPriceDetails(){
        String result,input;
        int n,index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the price details");
        try{
            for(int i = 0;i < n;i++){
                input  = sc.next();
                a[i] = Integer.parseInt(input);
            }
            System.out.println("Enter the index of the array element you want to access");
            index = sc.nextInt();
            result = "The array element is "+a[index];
            return result;   
        }catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }catch(NumberFormatException e){
            return "Input was not in the correct format";
        }
    }
}