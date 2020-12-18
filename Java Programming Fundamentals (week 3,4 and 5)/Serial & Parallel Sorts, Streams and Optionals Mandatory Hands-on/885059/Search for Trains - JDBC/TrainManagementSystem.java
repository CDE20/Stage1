import java.sql.*;
import java.util.ArrayList;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> list = new ArrayList<>();
		try {
		    
		    Statement st = DB.getConnection().createStatement();
		    String query = "Select * from train where source = '"+source+"' and destination = '"+destination+"' and "+coachType+">0 order by train_number;";
		    ResultSet rs = st.executeQuery(query);
		    Train t;
		    while(rs.next()){
		        list.add(new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
		    }
          rs.close();
          return list;
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
		return null;
		
	}

}
