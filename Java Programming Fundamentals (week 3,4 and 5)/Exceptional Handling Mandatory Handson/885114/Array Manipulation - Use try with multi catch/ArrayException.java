import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayException {
    
    public String getPriceDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        
        int[] input = new int[n];
        int output = 0;
        
        try {
            System.out.println("Enter the price details");
            for (int i = 0; i < input.length; i++) {
                
                input[i] = sc.nextInt();    // InputMismatchException
                
            }
            
            System.out.println("Enter the index of the array element you want to access");
            
            int index = sc.nextInt();
            output = input[index];          // ArrayIndexOutOfBoundsException
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        } 
        catch (InputMismatchException e) {
            return "Input was not in the correct format";
        }
        
        return "The array element is " + output;
    }
    public static void main (String[] args) {
        ArrayException ae = new ArrayException();
        System.out.println(ae.getPriceDetails());
    }
    
}