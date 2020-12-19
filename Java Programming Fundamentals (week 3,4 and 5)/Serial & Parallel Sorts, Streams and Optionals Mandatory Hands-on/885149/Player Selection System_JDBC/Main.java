import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		// fill your code here
		System.out.println("Enter the minimum height");
		double ht=sc.nextDouble();
		System.out.println("Enter the maximum weight");
		double wt=sc.nextDouble();
		PlayerSelectionSystem pss = new PlayerSelectionSystem();
		List<String> playerlist = new ArrayList<>();
		playerlist=pss.playersBasedOnHeightWeight(ht,wt);
		if(playerlist.isEmpty()){
		    System.out.println("No players are with minimum height of "+ht+" and maximum weight of "+wt);
		}
		else{
		for(String s:playerlist){
		    System.out.println(s);
		}
		}
		
	}
}