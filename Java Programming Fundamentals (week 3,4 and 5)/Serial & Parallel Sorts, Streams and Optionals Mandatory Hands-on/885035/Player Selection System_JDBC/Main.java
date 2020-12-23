import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// fill your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double height=sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double weight=sc.nextDouble();
		PlayerSelectionSystem p=new PlayerSelectionSystem();
		List<String> list=p.playersBasedOnHeightWeight(height, weight);
		if(list.isEmpty()) {
			System.out.println("No players are with minimum height of "+height
					+ " and maximum weight of " +weight);
			return;
		}
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
