import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

	
	public String getPriceDetails() {
		
		Scanner sc = new Scanner(System.in);
		int element=0;
		try {
			System.out.println("Enter the number of elements in the array");
			int noOfElements = sc.nextInt();
			int arr[] = new int[noOfElements];
			System.out.println("Enter the price details");
			for(int i=0;i<noOfElements;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int access = sc.nextInt();
			element = arr[access];
			return "The array element is "+element;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			return "Array index is out of range";
		}
		catch(InputMismatchException io) {
			return "Input was not in the correct format";
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayException ae = new ArrayException();
		String out = ae.getPriceDetails();
		System.out.println(out);
	}
	
}
