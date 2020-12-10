public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public void setHostelName(String name){
        this.hostelName=name;
    }
    public String getHostelName(){
        return this.hostelName;
    }
    
    public void setRoomNumber(int room){
        this.roomNumber=room;
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
}