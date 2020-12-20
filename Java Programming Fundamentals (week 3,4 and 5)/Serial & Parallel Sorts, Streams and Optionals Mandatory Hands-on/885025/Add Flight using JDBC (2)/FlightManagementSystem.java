import java.sql.*;
import javax.sql.*;
public class FlightManagementSystem {
    public  boolean addFlight(Flight flightObj){
        int rin = 0;
        try{
        Connection con = DB.getConnection();
        String query = "insert into flight(flightId, source, destination, noofseats, flightfare)" 
                        + "values(?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,flightObj.getFlightId());
        ps.setString(2,flightObj.getSource());
        ps.setString(3,flightObj.getDestination());
        ps.setInt(4,flightObj.getNoOfSeats());
        ps.setDouble(5,flightObj.getFlightFare());
        
         rin = ps.executeUpdate();
        }
        catch(Exception e){ System.out.println(e);}  
        if(rin==1)
            return true;
        else 
            return false;
    }
}