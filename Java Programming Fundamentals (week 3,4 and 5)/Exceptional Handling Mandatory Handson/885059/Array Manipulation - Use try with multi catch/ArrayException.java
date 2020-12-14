import java.util.*;
public class ArrayException {
    final Scanner sc = new Scanner(System.in);
    public String getPriceDetails() {
        int[] arr;
        int n;
        String err;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the price details");
        try {
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            System.out.println("Enter the index of the array element you want to access");;
            int ind = sc.nextInt();
            //int output = ;
            return "The array element is "+arr[ind];
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }
    
    public static void main (String[] args) {
        ArrayException ae = new ArrayException();
        System.out.println(ae.getPriceDetails());
    }
}