import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem fm = new FlightManagementSystem();
        
        if(fm.addFlight(new Flight(01,"Hyderabad","Delhi",200,500)))
                System.out.println("Flight details added successfully");
        else 
                System.out.println("Addition not done");
        
    }
}