import java.util.*;
public class Main {
	public static void main(String[] args) {
	    PlayerSelectionSystem obj=new PlayerSelectionSystem();
	    Scanner sc=new Scanner(System.in);
	    double height,weight;
	System.out.println("Enter the minimum height");
    height=sc.nextDouble();
    System.out.println("Enter the maximum weight");
    weight=sc.nextDouble();
    List<String> list=new ArrayList<>();
    
    list=obj.playersBasedOnHeightWeight(height,weight);
    if(list.size()==0)
    System.out.println("No players are with minimum height of "+height+" and maximum weight of "+weight);
    else{
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }}
    
		
	}
}
