import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter source");
        String src=sc.nextLine();
        System.out.println("enter Destination");
        String des=sc.nextLine();
        System.out.println("enter noofseat");
        int nseat=sc.nextInt();
        System.out.println("enter fare");
        double fare=sc.nextDouble();
        
        Flight f = new Flight(id,src,des,nseat,fare);
        FlightManagementSystem fm = new FlightManagementSystem();
        boolean result=fm.addFlight(f);
        if(result){
            System.out.println("Flight details added successfully");
        }
        else{
            System.out.println("Addition not done");
        }
        
        
    }
}