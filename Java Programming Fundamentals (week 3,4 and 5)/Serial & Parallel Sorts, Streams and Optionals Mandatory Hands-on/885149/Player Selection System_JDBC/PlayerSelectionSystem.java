import java.util.*;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> names = new ArrayList<>();
		try{
		DB db= new DB();
		Connection conn = db.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("Select playerName from player "+
		"WHERE height >= "+minHeight+
		" AND weight <= "+maxWeight+
		" ORDER BY height,weight;");
		while(rs.next()){
		    String nm=rs.getString("playerName");
		    names.add(nm);
		}
		}catch(Exception e){
		    e.printStackTrace();
		}
		Collections.sort(names);
		return names;
	}
}
