import java.sql.*;
import java.util.ArrayList;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> trains=new ArrayList<>();
		try {
		    
		DB db = new DB();
        Connection con = db.getConnection();
        
        int train_no,ac1,ac2,ac3,sl,ss;
        String train_name;
        String src;
        String dest;
        int col;
        PreparedStatement pstmt = con.prepareStatement("SELECT train_number,train_name,source,destination,ac1,ac2,ac3,sleeper,seater FROM train where source=? and destination=? ");
        pstmt.setString(1,source);
        pstmt.setString(2,destination);

        ResultSet rs = pstmt.executeQuery();
        int flag=0;
        while (rs.next()) {     
            flag=0;
             train_no = rs.getInt(1);  
             train_name=rs.getString(2);
             src=rs.getString(3);
             dest=rs.getString(4);
             ac1=rs.getInt(5);
             ac2=rs.getInt(6);
             ac3=rs.getInt(7);
             sl=rs.getInt(8);
             ss=rs.getInt(9);
             int index=rs.findColumn(coachType);
             col=rs.getInt(index);
             if(col>0)
             {
                 Train t1=new Train(train_no,train_name,source,destination,ac1,ac2,ac3,sl,ss);
                 trains.add(t1);
             }
             
            }
            if(trains.isEmpty())
            {
                System.out.println("No trains found");
            }
        
		} catch(Exception e) {
		    System.out.println(e);
		}
		return trains;
	}

}
