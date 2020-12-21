import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {
	public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) throws ClassNotFoundException, SQLException {

		// Fill your code here
		Connection con=DB.getConnection();
		String sql="select playerName from player where height >= ? and weight <= ? order by playerName";
		PreparedStatement smt=con.prepareStatement(sql);
		smt.setDouble(1, minHeight);
		smt.setDouble(2, maxWeight);
		ResultSet rs=smt.executeQuery();
		List<String> list=new ArrayList<>();
		while(rs.next()) {
			list.add(rs.getString(1));
		}
		return list;
	}
}
