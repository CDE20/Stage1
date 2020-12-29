import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Flight flight = new Flight(1, "Mumbai", "Pune", 2, 1000.25);
        FlightManagementSystem fms = new FlightManagementSystem();
        
        boolean addFlight = fms.addFlight(flight);
        System.out.println(addFlight);
    }
}