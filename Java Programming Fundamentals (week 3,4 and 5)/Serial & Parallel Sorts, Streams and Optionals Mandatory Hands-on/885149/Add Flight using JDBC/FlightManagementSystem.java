import java.sql.*;
public class FlightManagementSystem{
    public boolean addFlight(Flight flightObj){
        int flightid=flightObj.getFlightId();
        String source=flightObj.getSource();
        String destination=flightObj.getDestination();
        int noofseat=flightObj.getNoOfSeats();
        double fare=flightObj.getFlightFare();
        try{
        DB db = new DB();
        Connection conn=db.getConnection();
        
        Statement stmt= conn.createStatement();
        //System.out.println("here");
        int n =stmt.executeUpdate("INSERT INTO flight (flightId,source,destination,noofseats,flightfare) "+
        "VALUES("+flightid+",'"+source+"','"+destination+"',"+noofseat+","+fare+")");
        return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}