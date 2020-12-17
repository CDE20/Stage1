import java.sql.*;
import java.util.*;

 public class FlightManagementSystem
 {
     public boolean addFlight(Flight flightObj){
         PreparedStatement p=null;
         boolean f=true;
         try{
             p=DB.getConnection().prepareStatement("insert into flight values(?,?,?,?,?)");
             p.setInt(1,flightObj.getFlightId());
             p.setString(2,flightObj.getSource());
             p.setString(3,flightObj.getDestination());
             p.setInt(4,flightObj.getNoOfSeats());
             p.setDouble(5,flightObj.getFlightFare());
             if(p.executeUpdate()==1){
                 f=true;
             }
             else{
                 f=false;
             }
         }
         catch(ClassNotFoundException|SQLException e){
             
         }
         return f;
     }
 }