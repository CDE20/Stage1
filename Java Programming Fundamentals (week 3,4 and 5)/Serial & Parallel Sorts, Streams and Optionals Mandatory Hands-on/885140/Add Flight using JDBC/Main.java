import java.sql.SQLException;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Flight F = new Flight(101, "Manmad", "Pune", 2, 10000);
        
        boolean result = new FlightManagementSystem().addFlight(F);
        if(result == true)
        	System.out.println("Flight details added successfully");
        else
        	System.out.println("Addition not done");
    }
}