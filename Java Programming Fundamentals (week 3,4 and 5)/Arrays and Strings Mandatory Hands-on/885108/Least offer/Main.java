import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input;
		String[][] s = new String[n][3];
		for(int i = 0;i < n;i++){
			input = sc.next();
			s[i] = input.split(",");
		}
		int[] discount_price = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < n;i++) {
			discount_price[i] = Integer.parseInt(s[i][1])*Integer.parseInt(s[i][2])/100;
			if(discount_price[i] < min)
				min = discount_price[i];
		}
		for(int i = 0;i < n;i++) {
			if(discount_price[i] == min)
				System.out.println(s[i][0]);
		}
		sc.close();
	}

}
