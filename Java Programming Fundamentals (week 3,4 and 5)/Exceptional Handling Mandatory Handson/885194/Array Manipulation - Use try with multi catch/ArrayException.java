import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayException {
    public String getPriceDetails() {
        String output = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int arraySize = sc.nextInt();
            int[] price = new int[arraySize];
            
            System.out.println("Enter the price details");
            for (int i = 0; i < price.length; i++) {
                price[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the array elements you want to access");
            int index = Integer.parseInt(sc.next());
            output = "The array element is " + price[index];
            
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        }
        return output;
    }
    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();
        String output = arrayException.getPriceDetails();
        System.out.println(output);
    }
}