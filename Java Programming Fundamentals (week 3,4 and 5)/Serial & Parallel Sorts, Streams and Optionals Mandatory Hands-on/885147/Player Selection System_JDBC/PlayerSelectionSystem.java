import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> playerList = new ArrayList<>();
		try{
		    Connection con = DB.getConnection();
		    
		    String query = "select * from player where height >= ? and weight <= ? order by playerName;";
		    PreparedStatement ps = con.prepareStatement(query);
		    ps.setDouble(1,minHeight);
		    ps.setDouble(2,maxWeight);
		    
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next()){
		        Player player = new Player(rs.getInt("playerId"),rs.getString("playerName"),rs.getDouble("height"),rs.getDouble("weight"));
		        playerList.add(player.getPlayerName());
		    }
		}catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}
}
