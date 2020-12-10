import java.util.*;
public class SnacksDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int pizza=sc.nextInt();
        System.out.println();
        System.out.print("Enter the no of puffs bought:");
        int puff=sc.nextInt();
        System.out.println();
        System.out.print("Enter the no of cool drinks bought:");
        int cooldrink=sc.nextInt();
        System.out.println();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+cooldrink);
        int total=(pizza*100)+(puff*20)+(cooldrink*10);
        System.out.println("Total Price="+total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}