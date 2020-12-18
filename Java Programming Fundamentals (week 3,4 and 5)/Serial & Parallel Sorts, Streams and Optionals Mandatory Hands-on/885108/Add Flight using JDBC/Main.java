import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
             FlightManagementSystem f = new FlightManagementSystem();
        Flight flight = new Flight(1,"asas", "asasasa", 2, 1499.2);
        System.out.println(f.addFlight(flight));
    }
}