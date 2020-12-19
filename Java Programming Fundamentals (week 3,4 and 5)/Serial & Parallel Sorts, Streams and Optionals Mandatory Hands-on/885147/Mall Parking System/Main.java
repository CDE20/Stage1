import java.util.*;
import java.text.*;
import java.time.*;

public class Main {

    public static void main(String [] args) throws ParseException{
   
        //Fill the Code
        Scanner sc=new Scanner(System.in);
        Date date1,date2,date3;
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String currentDate="29/10/2019 20:10";
        date3=dateFormat.parse(currentDate);
        try{
        System.out.println("In-time");
        String inTime=sc.nextLine();
        if(isValid(inTime)){
            System.out.println(inTime + " is an Invalid In-Time");
            return;
        }
        date1=dateFormat.parse(inTime);
        if(date1.after(date3) || date1.equals(date3)){
            System.out.println(inTime+" is an Invalid In-Time");
            return;
        }
        System.out.println("Out-time");
        String outTime=sc.nextLine();
        if(isValid(outTime)){
            System.out.println(outTime + " is an Invalid Out-time");
            return;
        }
        date2=dateFormat.parse(outTime);
        if(date2.before(date1) || date2.equals(date1)){
            System.out.println(outTime+" is an Invalid Out-time");
            return;
        }
               double diff=date2.getTime() - date1.getTime();
               double diffhours=Math.ceil(diff/(60*60*1000));
               int price=(int)(diffhours*10);
               System.out.println(price+" Rupees");
        } catch(Exception e){
            e.printStackTrace();
        }
}
        private static boolean isValid(String datastr){
            DateFormat sdf=new SimpleDateFormat("dd/mm/yyyy HH:mm");
            sdf.setLenient(false);
            try{
                sdf.parse(datastr);
            }catch(ParseException e){
                return true;
            }
            return false;
        }
}
