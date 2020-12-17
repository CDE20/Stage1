import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> list = new ArrayList<String>();
		Connection conn = null;
		ResultSet rs  = null;
		String sql = "select playerName from player where height>=" + minHeight + " and weight<=" + maxWeight + " order by playerName";
		try {
			conn = DB.getConnection();
			
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString("playerName"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
