import java.sql.*; 
public class FlightManagementSystem {
    
    public  boolean addFlight(Flight flightObj)
    {
        try {
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            String query = "INSERT INTO FLIGHT VALUES ("+flightObj.getFlightId()+",'"+flightObj.getSource()+"','"+flightObj.getDestination()+"',"+flightObj.getNoOfSeats()+",'"+flightObj.getFlightFare()+"');";
            
            if(st.executeUpdate(query) > 0)
                return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}