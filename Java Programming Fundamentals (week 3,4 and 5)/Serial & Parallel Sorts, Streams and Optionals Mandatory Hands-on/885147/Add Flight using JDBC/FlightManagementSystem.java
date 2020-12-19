import java.sql.*;

public class FlightManagementSystem{
    
    public boolean addFlight(Flight flightObj){
        
        int flightId=flightObj.getFlightId();
        String source=flightObj.getSource();
        String destination=flightObj.getDestination();
        int noOfSeats=flightObj.getNoOfSeats();
        double flightFare=flightObj.getFlightFare();
        int count=0;
        DB database = new DB();
        try(Connection con = database.getConnection()){
            String query = "Insert into flight values(?,?,?,?,?)";
            
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,flightId);
            st.setString(2,source);
            st.setString(3,destination);
            st.setInt(4,noOfSeats);
            st.setDouble(5,flightFare);
            
            count = st.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        if(count==1)
            return true;
        else
            return false;

    }
}