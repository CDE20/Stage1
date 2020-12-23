
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination) throws ClassNotFoundException, SQLException{
		
		// Fill your code here	
		Connection con = DB.getConnection();
		ArrayList<Train> list=new ArrayList<Train>();

		//String query="SELECT * FROM train WHERE " + coachType + " > 0 ";
		/*String sql="";
		if(coachType.equals("ac1")) {
			sql="select * from train where source=? and destination=? and ac1 > 0 order by train_number";
		}else if(coachType.equals("ac2")) {
			sql="select * from train where source=? and destination=? and ac2 > 0 order by train_number";
		}else if(coachType.equals("ac1")) {
			sql="select * from train where source=? and destination=? and ac3 > 0 order by train_number";
		}else if(coachType.equals("sleeper")) {
			sql="select * from train where source=? and destination=? and sleeper > 0 order by train_number";
		}else if(coachType.equals("seater")) {
			sql="select * from train where source=? and destination=? and seater > 0 order by train_number";
		}
		
		PreparedStatement smt=con.prepareStatement(sql);
		
		smt.setString(1,source);
		smt.setString(2, destination);
		ResultSet rs=smt.executeQuery();*/
		String query = "SELECT * FROM train WHERE source = '" + source + "' AND destination = '" + destination
			     + "' AND " + coachType + " != 0 ORDER BY train_number";

   Statement st = con.createStatement();

   ResultSet rs = st.executeQuery(query);
		if(rs==null)
			return list;
		while(rs.next()) {
			//System.out.println("In while");
			int trainNumber=rs.getInt(1);
			String trainName=rs.getString(2);
			String src=rs.getString(3);
			String dest=rs.getString(4);
			int ac1=rs.getInt(5);
			int ac2=rs.getInt(6);
			int ac3=rs.getInt(7);
			int sl=rs.getInt(8);
			int ss=rs.getInt(9);
			Train t=new Train(trainNumber, trainName, src, dest, ac1, ac2, ac3, sl, ss);
			list.add(t);
		}
		return list;
		
	}

}