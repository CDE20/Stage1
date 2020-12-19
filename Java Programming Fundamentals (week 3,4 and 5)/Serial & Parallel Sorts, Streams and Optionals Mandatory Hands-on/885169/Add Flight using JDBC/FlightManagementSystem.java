import java.util.*;
import java.sql.*;
public class FlightManagementSystem{
    public boolean addFlight(Flight flightobj )
    {
        try{
        DB db=new DB();
        Connection con=db.getConnection();
        PreparedStatement pst=con.prepareStatement("insert into Flight values(?,?,?,?,?)" );
        
        pst.setInt(1,flightobj.getFlightId());
        pst.setString(2,flightobj.getSource());
        pst.setString(3,flightobj.getDestination());
        pst.setInt(4,flightobj.getNoOfSeats());
        pst.setDouble(5,flightobj.getFlightFare());
        
        int i=pst.executeUpdate();
        con.close();
        if(i>0)
        return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
}