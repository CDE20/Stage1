import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double minHeight = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the maximum weight");
		double maxWeight = Integer.parseInt(sc.nextLine());
		
		PlayerSelectionSystem pss = new PlayerSelectionSystem();
		List<String> playersBasedOnHeightWeight = pss.playersBasedOnHeightWeight(minHeight, maxWeight);
		
		if (playersBasedOnHeightWeight.size() == 0) {
			System.out.println("No players are with minimum height of " + minHeight + " and maximum weight of " + maxWeight);
			return;
		}
		
		for (String playerNames : playersBasedOnHeightWeight) {
			System.out.println(playerNames);
		}
		
	}
}