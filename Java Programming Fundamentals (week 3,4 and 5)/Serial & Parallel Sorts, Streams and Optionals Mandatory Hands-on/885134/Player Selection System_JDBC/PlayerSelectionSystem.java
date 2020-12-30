import java.util.*;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> players=new ArrayList<String>();
		try {
		    
    		DB db = new DB();
            Connection con = db.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement("SELECT playerName FROM player where height>=? and weight<=? order by playerName ");
            pstmt.setDouble(1,minHeight);
            pstmt.setDouble(2,maxWeight);

            ResultSet rs = pstmt.executeQuery();
            String pname;
            while (rs.next()) {     
                 pname=rs.getString(1);
                 players.add(pname);
            }
            if(players.isEmpty())
            {
                System.out.println("No players are with minimum height of "+minHeight+" and maximum weight of "+maxWeight);
            }
		}
	    catch(Exception e) {
		    System.out.println(e);
		}
		return players;
	}
}
