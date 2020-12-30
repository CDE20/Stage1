import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		// fill your code here
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double height=sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double weight=sc.nextDouble();
		
		PlayerSelectionSystem pms=new PlayerSelectionSystem();
		List<String> players=pms.playersBasedOnHeightWeight(height,weight);
		for(int i=0;i<players.size();i++)
		{
		    String name=players.get(i);
		    System.out.println(name);
		}
	}
}