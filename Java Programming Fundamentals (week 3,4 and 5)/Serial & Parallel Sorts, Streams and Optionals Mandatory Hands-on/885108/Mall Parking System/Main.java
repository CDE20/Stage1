import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

public static void main(String [] args)throws Exception {
   
        //Fill the Code
	Scanner sc = new Scanner(System.in);
	String start, end, current = "29/10/2019 20:10",regex = "[0-9][0-9][/][0-9][0-9][/][0-9][0-9][0-9][0-9] [0-9][0-9]:[0-9][0-9]";
	Date d_current = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(current);
	int cost = 0;
	double hours;
	System.out.println("In-time");
    start = sc.nextLine();
	if(start.matches(regex))
	{
		Date d_start = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(start);
		if((d_current.getTime())/(1000*60) - (d_start.getTime())/(1000*60) >= 1) {
			System.out.println("Out-time");
			end = sc.nextLine();
			if(end.matches(regex)) {
				Date d_end = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(end);
				if((d_end.getTime())/(1000*60) - (d_start.getTime())/(1000*60) >= 1) {
					hours = (((double)d_end.getTime())/(1000*60*60) - ((double)d_start.getTime())/(1000*60*60));
					//System.out.println(((double)d_end.getTime())/(1000*60*60) + "   " + ((double)d_start.getTime())/(1000*60*60));
					//System.out.println(hours);
					hours = Math.ceil(hours);
					cost = 10 * (int)hours;
					System.out.println(cost+" Rupees");
				}else {
					System.out.println(end+" is an Invalid Out-Time");
				}
			}
			else {
				System.out.println(end+" is an Invalid Out-Time");
			}
		}
		else {
			System.out.println(start+" is an Invalid In-Time");
		}
	}
	else {
		System.out.println(start+" is an Invalid In-Time");
	}
}
}