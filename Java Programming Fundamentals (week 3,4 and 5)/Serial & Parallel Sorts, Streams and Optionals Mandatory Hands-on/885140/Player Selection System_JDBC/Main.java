import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double minimum = sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double maximum = sc.nextDouble();
		
		List<String> list = new PlayerSelectionSystem().playersBasedOnHeightWeight(minimum, maximum);
		if(list.isEmpty())
			System.out.println("No players are with minimum height of " + minimum + " and maximum weight of " + maximum);
		else {
			/*Comparator<String> C = (i1,i2)->{
				return i1.compareTo(i2);
			};
			list.sort(C);*/
			for (String str : list) {
				System.out.println(str);
			}
		}
		
	}
}