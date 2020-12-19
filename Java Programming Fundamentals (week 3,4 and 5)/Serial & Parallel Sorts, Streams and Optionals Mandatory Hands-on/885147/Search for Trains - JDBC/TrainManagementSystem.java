
import java.sql.*;
import java.util.ArrayList;


public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> trains = new ArrayList<>();
		try {
			Connection con = DB.getConnection();
			String string = "select * from train" 
					+ " where source = ? and destination = ? and " + coachType + " > 0;";
			
			PreparedStatement ps = con.prepareStatement(string);
			ps.setString(1, source);
			ps.setString(2, destination);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next())	{
				Train train = new Train(rs.getInt("train_number"), 
						rs.getString("train_name"), 
						rs.getString("source"),
						rs.getString("destination"),
						rs.getInt("ac1"),
						rs.getInt("ac2"),
						rs.getInt("ac3"),
						rs.getInt("sleeper"),
						rs.getInt("seater"));
				trains.add(train);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return trains;
	}

}
