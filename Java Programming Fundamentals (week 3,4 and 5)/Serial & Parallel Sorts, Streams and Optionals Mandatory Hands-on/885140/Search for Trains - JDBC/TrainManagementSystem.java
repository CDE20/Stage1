
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainManagementSystem {
	

	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		Connection conn = null;
		ResultSet Rs = null;
		String sql = "select * from train where source=? and destination=? and " + coachType.toLowerCase() + ">=1";
		ArrayList<Train> train = new ArrayList<>();
		try {
			conn = DB.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, source);
			ps.setString(2, destination);
			
			Rs = ps.executeQuery();
			while(Rs.next()) {
				Train T = new Train(Rs.getInt(1),Rs.getString(2),source,destination,Rs.getInt(5),Rs.getInt(6),Rs.getInt(7),Rs.getInt(8),Rs.getInt(9));
				train.add(T);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return train;
		
	}

}
