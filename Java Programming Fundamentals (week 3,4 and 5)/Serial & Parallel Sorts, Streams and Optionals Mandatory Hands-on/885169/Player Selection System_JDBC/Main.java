import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum height");
		double height=sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double weight=sc.nextDouble();
		sc.close();
		
		PlayerSelectionSystem ps=new PlayerSelectionSystem();
		
		List<String> list1=ps.playersBasedOnHeightWeight(height,weight);
		
		if(list1.isEmpty())
		{
		   System.out.printf("No players are with minimum height of %.1f and maximum weight of %.1f", height,weight);
		   return;
		}
		
		for(String s:list1)
		{
		    System.out.println(s);
		}

		
	}
}