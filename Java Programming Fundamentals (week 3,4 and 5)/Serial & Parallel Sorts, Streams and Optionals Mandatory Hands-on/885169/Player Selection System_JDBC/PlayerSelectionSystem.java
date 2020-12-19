import java.util.List;
import java.sql.*;
import java.util.ArrayList;


public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> list=new ArrayList<String>();
		try {
		    
		    DB db=new DB();
		    Connection con=db.getConnection();
		    Statement stmt=con.createStatement();
		    String query= "select * from player where height>=" +minHeight+ "and weight<=" + maxWeight + "order by playerName";
		    ResultSet rs=stmt.executeQuery(query);
		     while(rs.next())
		     {
		         list.add(rs.getString("playerName"));
		     }
		    stmt.close();
		} catch(ClassNotFoundException | SQLException e) {
		    e.printStackTrace();
		}
		
		return list;
	}
}
