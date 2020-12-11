import java.util.Scanner;

class AsciValue{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		String arr[] = new String[4];
		for(int i = 0;i<4;i++) {
			int number = sc.nextInt();
			char a = (char) number;
			arr[i] = number + "-" + a;
		}
		for(int i = 0;i<4;i++) {
			System.out.println(arr[i]);
		}
	}
}