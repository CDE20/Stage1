import java.util.*;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem f=new FlightManagementSystem();
        Flight flightObj=new Flight(123, "pune", "delhi", 4, 4000);
        if(f.addFlight(flightObj))
        {
        	System.out.println("Flight details added successfully");
        	return;
        }
        else
        	System.out.println("Addition not done");
        return;
    }
}
