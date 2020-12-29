import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FlightManagementSystem {
	public boolean addFlight(Flight flightObj) {
		int executeUpdate = 0;
		try {
			Connection connection = DB.getConnection();
			
			String query = "insert into flight " 
							+ "(flightId, source, destination, noofseats, flightfare) values "
							+ "(?, ?, ?, ?, ?);";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,  flightObj.getFlightId());
			preparedStatement.setString(2, flightObj.getSource());
			preparedStatement.setString(3, flightObj.getDestination());
			preparedStatement.setInt(4, flightObj.getNoOfSeats());
			preparedStatement.setDouble(5, flightObj.getFlightFare());
			executeUpdate = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		boolean updated = false;
		if (executeUpdate > 0) updated = true;
		
		return true;
	}
}