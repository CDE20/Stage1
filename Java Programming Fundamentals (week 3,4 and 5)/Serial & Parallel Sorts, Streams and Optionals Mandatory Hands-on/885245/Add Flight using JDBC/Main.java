import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter flightId:");
        int flightId=sc.nextInt();
        System.out.println("Enter source:");
        String source=sc.next();
        System.out.println("Enter destination:");
        String destination=sc.next();
        System.out.println("Enter no of seats:");
        int noOfSeats=sc.nextInt();
        System.out.println("Enter flight fare");
        Double flightfare=sc.nextDouble();
        sc.close();
        FlightManagementSystem f = new FlightManagementSystem();
        if(f.addFlight(new Flight(flightId,source,destination,noOfSeats,flightfare)))
        {
            System.out.println("Flight details added successfully");
            return;
        }
        System.out.println("Addition not done");
    }
}