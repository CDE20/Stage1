import java.util.*;
import java.sql.*;


public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		List<String> list=new ArrayList<String>();
		    
		    try{
		    String query="select playerName from player where height>="+minHeight+" and weight<="+maxWeight+" order by playerName";
		    Connection con=DB.getConnection();
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery(query);
		    while(rs.next()){
		        list.add(rs.getString("playerName"));
		    }
		    
		} catch(Exception e){
		System.out.println("dscsdc");
}
		
		return list;
	}
}

