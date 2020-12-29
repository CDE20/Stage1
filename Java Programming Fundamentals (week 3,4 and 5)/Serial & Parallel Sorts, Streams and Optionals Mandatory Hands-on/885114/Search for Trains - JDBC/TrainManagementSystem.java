
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> trains = new ArrayList<>();
		try {
			Connection connection = DB.getConnection();
			String string = "select * from train" 
					+ " where source = ? and destination = ? and " + coachType + " > 0;";
			
			PreparedStatement preparedStatement = connection.prepareStatement(string);
			preparedStatement.setString(1, source);
			preparedStatement.setString(2, destination);
			
			ResultSet executeQuery = preparedStatement.executeQuery();
			
			while (executeQuery.next())	{
				Train train = new Train(executeQuery.getInt("train_number"), 
						executeQuery.getString("train_name"), 
						executeQuery.getString("source"),
						executeQuery.getString("destination"),
						executeQuery.getInt("ac1"),
						executeQuery.getInt("ac2"),
						executeQuery.getInt("ac3"),
						executeQuery.getInt("sleeper"),
						executeQuery.getInt("seater"));
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
