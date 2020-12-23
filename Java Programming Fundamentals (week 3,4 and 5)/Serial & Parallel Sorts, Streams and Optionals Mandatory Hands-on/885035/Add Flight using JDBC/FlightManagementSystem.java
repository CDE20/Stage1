import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem {
	public  boolean addFlight(Flight flightObj){
		try {
			Connection con = DB.getConnection();
			PreparedStatement smt=con.prepareStatement("insert into flight values(?,?,?,?,?)");
			smt.setInt(1, flightObj.getFlightId());
			smt.setString(2,flightObj.getSource());
			smt.setString(3,flightObj.getDestination());
			smt.setInt(4,flightObj.getNoOfSeats());
			smt.setDouble(5, flightObj.getFlightFare());
			int res=smt.executeUpdate();
			if(res>0)
				return true;
			else
				return false;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}