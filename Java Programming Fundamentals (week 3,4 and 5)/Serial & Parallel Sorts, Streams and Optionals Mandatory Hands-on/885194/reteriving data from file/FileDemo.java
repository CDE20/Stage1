import java.io.*;
import java.util.*;

public class FileDemo
{
    public static void main(String[] args)
    {
        File f;
	    try
	    {
    	    f=new File("log.txt");
    	    Scanner sc=new Scanner(f);
        	    while(sc.hasNextLine())
        	    {
        	        String x=sc.nextLine();
        	        System.out.println(x);
        	    } 
    	    sc.close();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
    }
}