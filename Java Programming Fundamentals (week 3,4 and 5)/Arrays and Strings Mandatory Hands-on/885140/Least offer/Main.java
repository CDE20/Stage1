import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int n = sc.nextInt();
		double totalDiscount = 0;
		String array[][]= new String[n][2];
		for(int i = 0;i<n;i++) {
			input = sc.next();
			String arr[] = input.split(",");
			String product = arr[0];
			int Price = Integer.parseInt(arr[1]);
			double discount = Integer.parseInt(arr[2]);
			
			totalDiscount = (discount/100) * Price;
			array[i][0] = product;
			array[i][1] = Double.toString(totalDiscount);
			
		}
		double min = Double.parseDouble(array[0][1]);
		for(int i = 0,j=1;i<n;i++) {
				if(Double.parseDouble(array[i][j])< min)
					min = Double.parseDouble(array[i][j]);
			}
		
		for(int i = 0,j=1;i<n;i++) {
				if(Double.parseDouble(array[i][j]) == min)
					System.out.println(array[i][0]);
		}
		}

	}