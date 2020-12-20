import java.util.*;
import java.sql.*;
import javax.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here
		List<String> list = new ArrayList<>();
		try{
		    Connection con = DB. getConnection();
		    String query = "select playerName from player where height >= ? and weight <= ? order by playerName;";
		    PreparedStatement ps = con.prepareStatement(query);
		    ps.setDouble(1,minHeight);
		    ps.setDouble(2,maxWeight);
		    ResultSet rs = ps.executeQuery();
		    while(rs.next())
		       list.add(rs.getString("playerName"));
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
}
