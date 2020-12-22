import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class TrainManagementSystem
{
	public ArrayList <Train> viewTrain (String coachType, String source, String destination)
	{
		// Fill your code here	
	    ArrayList<Train> trainList = new ArrayList<Train>();
	    try
	    {
	        Connection con = DB.getConnection();
	        String q= "SELECT * FROM train WHERE source = '"+source+"' AND destination = '"+destination+"' AND "+coachType+" !=0 ORDER BY train_number";
	        Statement st = con.createStatement();
	        ResultSet rt = st.executeQuery(q);
	        while(rt.next())
	        {
	            int trainNumber = rt.getInt(1);
	            String trainName = rt.getString(2);
	            String sourceCity = rt.getString(3);
	            String destinationCity = rt.getString(4);
	            int ac1 = rt.getInt(5);
	            int ac2 = rt.getInt(6);
	            int ac3 = rt.getInt(7);
	            int s1 = rt.getInt(8);
	            int ss = rt.getInt(9);
	            trainList.add(new Train(trainNumber,trainName,sourceCity,destinationCity,ac1,ac2,ac3,s1,ss));
	        }
	        st.close();
	        con.close();
	    }
	    catch(ClassNotFoundException | SQLException e)
	    {
	        e.printStackTrace();
	    }
		return trainList;
	}
}
