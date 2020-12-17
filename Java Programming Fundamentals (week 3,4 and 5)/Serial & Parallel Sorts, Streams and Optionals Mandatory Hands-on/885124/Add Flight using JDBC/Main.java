import java.util.*;
public class Main{
    public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
         int flightId=sc.nextInt();
         sc.nextLine();
         String s=sc.nextLine();
         String d=sc.nextLine();
         int ns=sc.nextInt();
         sc.nextLine();
         double fF=sc.nextDouble();
         Flight f=new Flight(flightId,s,d,ns,fF);
         FlightManagementSystem fm=new FlightManagementSystem();
         if(fm.addFlight(f)){
             System.out.println("Flight details added successfully");
         }
         else{
             System.out.println("Addition not done");
         }
    }
}