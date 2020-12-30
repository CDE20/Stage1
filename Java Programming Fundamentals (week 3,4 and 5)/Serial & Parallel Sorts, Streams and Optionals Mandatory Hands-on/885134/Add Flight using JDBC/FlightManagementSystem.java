import java.util.*;
import java.sql.*;
public class FlightManagementSystem
{
    public  boolean addFlight(Flight flightObj)
    {
        try {
            DB db=new DB();
            Connection con=db.getConnection();
            
            PreparedStatement pstmt= con.prepareStatement("insert into flight values(?,?,?,?,?)");
            pstmt.setInt(1,flightObj.getFlightId());
            pstmt.setString(2,flightObj.getSource());
            pstmt.setString(3,flightObj.getDestination());
            pstmt.setInt(4,flightObj.getNoOfSeats());
            pstmt.setDouble(5,flightObj.getFlightFare());
            
            int i=pstmt.executeUpdate();
            con.close();
            
            if(i>0)
                return true;
        } catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}