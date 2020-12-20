
import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here
		Train t;
		ArrayList<Train> l =new ArrayList<>();
		try{
		    Connection con = DB.getConnection();
		    String query = "select * from train where source = ? and destination = ? and "+coachType+" <> 0 order by train_number;";
		  
		   PreparedStatement ps = con.prepareStatement(query);
		     
		   ps.setString(1,source);
		   ps.setString(2,destination);
		  
		    
		   ResultSet rs = ps.executeQuery();
		    
		   while(rs.next()){
		       //System.out.println(rs.getInt("train_number")+rs.getString("train_name")+rs.getString("source")+rs.getString("destination")+
		                       //rs.getInt("ac1")+rs.getInt("ac2")+rs.getInt("ac3")+rs.getInt("sleeper")+rs.getInt("seater"));
		       t = new Train(rs.getInt("train_number"),rs.getString("train_name"),rs.getString("source"),rs.getString("destination"),
		                       rs.getInt("ac1"),rs.getInt("ac2"),rs.getInt("ac3"),rs.getInt("sleeper"),rs.getInt("seater") );
		      l.add(t);
		       
		   }
		}
		catch(Exception e){System.out.println(e);}
		return l;
		
	}

}
