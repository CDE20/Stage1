import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double minHeight = sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double maxWeight = sc.nextDouble();
		PlayerSelectionSystem pss = new PlayerSelectionSystem();
		List<String> names = pss.playersBasedOnHeightWeight(minHeight, maxWeight);
		if(names.size()>0)
		{
		    for(String n: names)
		        System.out.println(n);
		} else {
		    System.out.println("No players are with minimum height of "+minHeight+" and maximum weight of "+maxWeight);
		}

		
	}
}