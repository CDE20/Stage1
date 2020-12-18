import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FlightManagementSystem{
    public boolean addFlight(Flight flightObj){
        try {
    		Connection con = DB.getConnection();
    		double flightfare = flightObj.getFlightFare();
    		int id = flightObj.getFlightId(),noofseats = flightObj.getNoOfSeats();
    		String source = flightObj.getSource(),destination = flightObj.getDestination();
    		String sql = "Insert into flight values(?,?,?,?,?)";
    		PreparedStatement stat = con.prepareStatement(sql);
    		stat.setInt(1, id);
    		stat.setString(2, source);
    		stat.setString(3, destination);
    		stat.setInt(4, noofseats);
    		stat.setDouble(5, flightfare);
    		int rowsAffected = stat.executeUpdate();
    		return true;
    	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return false;
    }
}