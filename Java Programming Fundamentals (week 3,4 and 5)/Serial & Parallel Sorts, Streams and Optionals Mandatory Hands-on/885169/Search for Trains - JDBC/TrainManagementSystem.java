import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TrainManagementSystem {

 public ArrayList<Train> viewTrain(String coachType, String source, String destination) {

  // Fill your code here
        ArrayList<Train> trainList = new ArrayList<Train>();

  try {
   Connection con = DB.getConnection();

   String query = "SELECT * FROM train WHERE source = '" + source + "' AND destination = '" + destination
     + "' AND " + coachType + " != 0 ORDER BY train_number";

   Statement st = con.createStatement();

   ResultSet rs = st.executeQuery(query);

   while (rs.next()) {

    int trainNumber = rs.getInt(1);
    String trainName = rs.getString(2);
    String sourceCity = rs.getString(3);
    String destinationCity = rs.getString(4);
    int ac1 = rs.getInt(5);
    int ac2 = rs.getInt(6);
    int ac3 = rs.getInt(7);
    int sl = rs.getInt(8);
    int ss = rs.getInt(9);

    trainList.add(new Train(trainNumber, trainName, sourceCity, destinationCity, ac1, ac2, ac3, sl, ss));
    
   }
   st.close();
   con.close();

  } catch (ClassNotFoundException | SQLException e) {
   e.printStackTrace();
  }

  return trainList;
 }
}