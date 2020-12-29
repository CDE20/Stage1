import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> playerNames = new ArrayList<>();
		
		try {
			Connection connection = DB.getConnection();
			String query = "select playerName from player "
					+ "where height >= ? and weight <= ? "
					+ "order by playerName";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, minHeight);
			preparedStatement.setDouble(2, maxWeight);
			
			ResultSet executeQuery = preparedStatement.executeQuery();
			
			while (executeQuery.next()) {
				playerNames.add(executeQuery.getString("playerName"));
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return playerNames;
	}
}
