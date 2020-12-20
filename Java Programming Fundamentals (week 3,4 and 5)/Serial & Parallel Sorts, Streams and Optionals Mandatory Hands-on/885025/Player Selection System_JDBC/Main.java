import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		PlayerSelectionSystem  p =new PlayerSelectionSystem();
        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the minimum height");
		Double height = sc.nextDouble();
		System.out.println("Enter the maximum weight");
		Double weight = sc.nextDouble();
		List<String> l=p.playersBasedOnHeightWeight(height,weight);
		if(l.size()==0){
		    System.out.println("No players are with minimum height of "+height+" and maximum weight of "+weight);
		}
	    else{	
	        for (String s : l) 
		        System.out.println(s);
	    }
	}
}