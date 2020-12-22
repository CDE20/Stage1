import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class FlightManagementSystem
{
    public boolean addFlight(Flight flightObj)
    {
        try
        {
            Connection con = DB.getConnection();
            String q = "INSERT INTO FLIGHT VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1,flightObj.getFlightId());
            st.setString(2,flightObj.getSource());
            st.setString(3,flightObj.getDestination());
            st.setInt(4,flightObj.getNoOfSeats());
            st.setDouble(5,flightObj.getFlightFare());
            st.executeUpdate();
            st.close();
            con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}