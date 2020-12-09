import java.util.Scanner;
public class AsciValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter the digits:");
		for(int i = 0;i < 4;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i < 4;i++) {
			System.out.println(a[i]+"-"+(char)a[i]);
			
		}
	}

}
