import java.util.*;
public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public void setHostelName(String hostelName){
        this.hostelName=hostelName;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber= roomNumber;
    }
    
    public String getHostelName(){
        return hostelName;
    }
    public int getRoomNumber(){
        return  roomNumber;
    }
    
}