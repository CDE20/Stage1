import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException{
	
	
	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		String answer = "";
		try {
			System.out.println("Enter the price details");
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			answer = "The array element is " + arr[index];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
		catch(InputMismatchException e) {
			return "Input was not in the correct format";
		}
		return answer;
	}
	public static void main(String[] args) {
		
		System.out.println(new ArrayException().getPriceDetails());
	}
}