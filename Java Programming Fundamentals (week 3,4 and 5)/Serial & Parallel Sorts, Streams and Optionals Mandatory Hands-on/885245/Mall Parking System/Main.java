import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main
{
    public static String current_time;
    public static void main(String [] args) 
    {
         //Fill the Code
         Scanner sc=new Scanner(System.in);
         current_time = "29/10/2019 20:10";
         SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy HH:mm");
         System.out.println("In-time");
         String i=sc.nextLine().trim();
         Date currentTime=null;
         Date inTime=null;
         Date outTime=null;
         try
         {
             currentTime=s.parse(current_time);
             inTime=s.parse(i);
         }
         catch(ParseException e)
         {
             System.out.println(i+" is an Invalid In-Time");
             sc.close();
             return;
         }
         long currentTime_inTime_diff = currentTime.getTime() - inTime.getTime();
         long currentTime_inTime_diff_in_min = currentTime_inTime_diff / (1000*60);
         if(currentTime_inTime_diff_in_min < 1)
         {
             System.out.println(i+" is an Invalid In-time");
             sc.close();
             return;
         }
         System.out.println("Out-time");
         String o=sc.nextLine().trim();
         sc.close();
         try
         {
             outTime=s.parse(o);
         }
         catch(ParseException e)
         {
             System.out.println(o+" is an Invalid Out-Time");
             return;
         }
         long outTime_inTime_diff = outTime.getTime() - inTime.getTime();
         long duration_in_hours = outTime_inTime_diff / (1000 *60 *60);
         long duration_in_min = outTime_inTime_diff / (1000 * 60);
         if(duration_in_min < 1)
         {
            System.out.println(o+" is an Invalid Out-Time"); 
            return;
         }
         int fees= (int) ((duration_in_min % 60)!=0 ? (duration_in_hours+1)*10 : (duration_in_hours*10));
         System.out.println(fees+" Rupees");
    }
}