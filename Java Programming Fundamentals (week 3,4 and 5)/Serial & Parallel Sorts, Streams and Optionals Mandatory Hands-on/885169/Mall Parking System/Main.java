import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;
public class Main {

public static void main(String [] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Date curr = new Date();
    Date intime, outtime;
    SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    curr = std.parse("29/10/2019 20:10");
    System.out.println("In-time");
    String in = br.readLine();
    try{
    intime = std.parse(in);
    }catch(Exception e)
    {
    	System.out.println(in+" is an Invalid In-Time");
    	return;
    }
    if(intime.after(curr) || intime.equals(curr) )
    {
    	System.out.println(in+" is an Invalid In-Time");
    	return;
    }
    System.out.println("Out-time");
    String out = br.readLine();
    try{
    outtime = std.parse(out);
    }catch(Exception e)
    {
    	System.out.println(out+" is an Invalid Out-Time");
    	return;
    }
    if(outtime.before(intime) || outtime.equals(intime) )
    {
    	System.out.println(out+" is an Invalid Out-Time");
    	return;
    }
    
    long milli = (outtime.getTime() - intime.getTime());
    int minutes = (int)(milli/(1000*60))%60;
    int hours = (int)(milli/(1000*60*60))%24;
    int days = (int)(milli/(1000 * 60 * 60 * 24));
    //
    hours += minutes>0? 1: 0;
  /*  System.out.println(minutes);
    System.out.println(hours);
    System.out.println(days);*/
    int result = (hours * 10) + (days * 24 *10);
    System.out.println(result+" Rupees");
}
}