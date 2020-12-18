import java.util.*;
import java.sql.*;
public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> names = new ArrayList<>();
		try {
    		
    		String query = "Select playerName from player where height>="+minHeight+" and weight<="+maxWeight+" order by playerName;";
    		PreparedStatement st = DB.getConnection().prepareStatement(query);
    		
    		ResultSet rs = st.executeQuery();
    		while(rs.next())
    		{
    		    names.add(rs.getString(1));
    		}
    		return names;
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return null;
	}
}
