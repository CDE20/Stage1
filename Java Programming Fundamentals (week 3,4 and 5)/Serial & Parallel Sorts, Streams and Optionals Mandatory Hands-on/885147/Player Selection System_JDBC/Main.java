import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		// fill your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minimum height");
        double height = sc.nextDouble();
        
        System.out.println("Enter the maximum weight");
        double weight = sc.nextDouble();
        
        PlayerSelectionSystem pss = new PlayerSelectionSystem();
        List<String> list = pss.playersBasedOnHeightWeight(height,weight);
        
        if(list.size()>0){
            for(String player:list){
                System.out.println(player);
            }
        }
        else{
            System.out.println("No players are with minimum height of "+height+" and maximum weight of "+weight);
        }
		
	}
}