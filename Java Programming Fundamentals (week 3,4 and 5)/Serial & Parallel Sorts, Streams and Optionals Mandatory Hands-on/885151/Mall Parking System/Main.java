import java.text.DateFormat;
import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Scanner;
 import java.util.*;
 
 public class Main {
	public static void main(String[] args) throws ParseException {
   		Scanner sc = new Scanner(System.in);
   		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
       	Date currDate = dateFormat.parse("29/10/2019 20:10");
 		try {
    			System.out.println("In-time");
    			String inDatePre = sc.nextLine();
    			if(isValid(inDatePre)){
    				System.out.println(inDatePre+" is an Invalid In-Time");
    				return;
    			}
    			Date inDate = dateFormat.parse(inDatePre) ;
    			if(inDate.after(currDate)|| inDate.equals(currDate)){
    				System.out.println(inDatePre+" is an Invalid In-Time");
    				return;
    			}
    			// 20/09/2019 23:55
    			// 21/09/2019 23:56
    			
    			System.out.println("Out-time");
    			String outDatePre = sc.nextLine();
    			if(isValid(outDatePre) ){
    				System.out.println(outDatePre+" is an Invalid Out-Time");
    				return;
    			}
    			Date outDate = dateFormat.parse(outDatePre) ;
    			if(outDate.before(inDate) || outDate.equals(inDate)){
    				System.out.println(outDatePre+" is an Invalid Out-Time");
    				return;
    			}
    			
    			double diff = outDate.getTime() - inDate.getTime();
    			
    			double diffHours = Math.ceil(diff / (60 * 60 * 1000 ));
    			
    			int price = (int)(diffHours * 10);
    			
    			System.out.println(price +" Rupees");
  		} catch (ParseException e) {
    			e.printStackTrace();
    		}       
  	}
  	private static boolean isValid(String dateStr) {
    		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            sdf.setLenient(false);
            try {
                sdf.parse(dateStr);
            } catch (ParseException e) {
                return true;
            }
            return false;
       }
    	}