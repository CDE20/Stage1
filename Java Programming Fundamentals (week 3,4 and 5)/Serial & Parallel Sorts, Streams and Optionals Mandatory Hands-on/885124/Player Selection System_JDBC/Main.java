import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// fill your code here
		Scanner sc = new Scanner(System.in);
		double minHeight, maxWeight;
		PlayerSelectionSystem pss = new PlayerSelectionSystem();
		List<String> alist = new ArrayList<>();
		System.out.println("Enter the minimum height");

		minHeight = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the maximum weight");
		maxWeight = Double.parseDouble(sc.nextLine());

		alist = pss.playersBasedOnHeightWeight(minHeight, maxWeight);

		if (!alist.isEmpty()) {
			for (String s : alist) {
				System.out.println(s);
			}
		} else {
			System.out.println(
					"No players are with minimum height of " + minHeight + " and maximum weight of " + maxWeight);
		}

	}
}