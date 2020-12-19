import java.sql.*;
import java.util.ArrayList;
import java.util.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> trn = new ArrayList<>();
		try{
		DB db = new DB();
		Connection conn=db.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select train_number,train_name from train "+
		"WHERE source='"+source+"' "+
		"AND destination = '"+destination+"' "+
		"AND "+coachType+ " > 0 "+
		"ORDER BY train_number;");
		
		while(rs.next()){
		    Train t = new Train(rs.getInt("train_number"),rs.getString("train_name"),source,destination,0,0,0,0,0);
		    trn.add(t);
		}
		
		}catch(Exception e){
		    e.printStackTrace();
		}
		return trn;
	}

}
