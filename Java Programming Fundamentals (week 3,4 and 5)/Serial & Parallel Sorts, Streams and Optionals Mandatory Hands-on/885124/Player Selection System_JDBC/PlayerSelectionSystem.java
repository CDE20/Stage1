import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

	 List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		ArrayList<String> alist = new ArrayList<>();
		// Fill your code here	
		//Player p;
		PreparedStatement pst = null;
		
		try {
			pst = DB.getConnection().prepareStatement("select playerName from player where height>=? and weight<=? order by playerName");
			pst.setDouble(1,minHeight);
			pst.setDouble(2, maxWeight);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				alist.add(rs.getString(1));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return alist;
	}
}
