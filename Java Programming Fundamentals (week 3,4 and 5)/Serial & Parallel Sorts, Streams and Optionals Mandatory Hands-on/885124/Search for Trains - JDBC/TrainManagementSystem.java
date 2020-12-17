
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainManagementSystem {

	public ArrayList<Train> viewTrain(String coachType, String source, String destination) {
		Train t;
		ArrayList<Train> lst = new ArrayList<Train>();
		// Fill your code here
		try {
			Connection con = DB.getConnection();
			
			if (coachType.equalsIgnoreCase("ac1")) {
				PreparedStatement pt = con.prepareStatement(
						"select train_number,train_name from train where source=? and destination=? and ac1>0 order by train_number ");

				pt.setString(1, source);
				pt.setString(2, destination);

				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					t = new Train(0, null, null, null, 0, 0, 0, 0, 0);
					t.setTrainNumber(rs.getInt(1));
					t.setTrainName(rs.getString(2)); 
					lst.add(t);

				}
			} else if (coachType.equalsIgnoreCase("ac2")) {
				PreparedStatement pt = con.prepareStatement(
						"select train_number,train_name from train where source=? and destination=? and ac2>0 order by train_number ");
				pt.setString(1, source);
				pt.setString(2, destination);

				ResultSet rs = pt.executeQuery();

				while (rs.next()) {
					t = new Train(0, null, null, null, 0, 0, 0, 0, 0);
					t.setTrainNumber(rs.getInt(1));
					t.setTrainName(rs.getString(2));
					lst.add(t);

				}

			} else if(coachType.equalsIgnoreCase("ac3")) {
				PreparedStatement pt = con.prepareStatement(
						"select train_number,train_name from train where source=? and destination=? and ac3>0 order by train_number ");
				pt.setString(1, source);
				pt.setString(2, destination);

				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					t = new Train(0, null, null, null, 0, 0, 0, 0, 0);
					t.setTrainNumber(rs.getInt(1));
					t.setTrainName(rs.getString(2));
					lst.add(t);

				}
			}
			else if(coachType.equalsIgnoreCase("sleeper")) {
				
				PreparedStatement pt = con.prepareStatement(
						"select train_number,train_name from train where source=? and destination=? and sleeper>0 order by train_number ");
				pt.setString(1, source);
				pt.setString(2, destination);

				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					t = new Train(0, null, null, null, 0, 0, 0, 0, 0);
					t.setTrainNumber(rs.getInt(1));
					t.setTrainName(rs.getString(2));
					lst.add(t);

				}
				
			}
			
			else if(coachType.equalsIgnoreCase("seater")) {
				PreparedStatement pt = con.prepareStatement(
						"select train_number,train_name from train where source=? and destination=? and seater>0 order by train_number ");
				pt.setString(1, source);
				pt.setString(2, destination);

				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					t = new Train(0, null, null, null, 0, 0, 0, 0, 0);
					t.setTrainNumber(rs.getInt(1));
					t.setTrainName(rs.getString(2));
					lst.add(t);

				}
				
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lst;

	}

}
