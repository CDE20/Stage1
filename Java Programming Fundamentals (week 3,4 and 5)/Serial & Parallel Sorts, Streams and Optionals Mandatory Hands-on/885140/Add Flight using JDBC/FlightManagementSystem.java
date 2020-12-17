import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightManagementSystem{
	
	public boolean addFlight(Flight flightObj) {
		
		 String sql="Insert into flight values(?,?,?,?,?)";
		 Connection conn = null;
		 ResultSet Rs = null;
	        try {
				conn = DB.getConnection();
		        PreparedStatement PS = conn.prepareStatement(sql);
				PS.setInt(1, flightObj.getFlightId());
				PS.setString(2,flightObj.getSource());
				PS.setString(3, flightObj.getDestination());
				PS.setInt(4,flightObj.getNoOfSeats());
				PS.setDouble(5, flightObj.getFlightFare());
				
				int count = PS.executeUpdate();
				if(count>0)
					return true;
				else
					return false;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	    return false;    
	}
}

