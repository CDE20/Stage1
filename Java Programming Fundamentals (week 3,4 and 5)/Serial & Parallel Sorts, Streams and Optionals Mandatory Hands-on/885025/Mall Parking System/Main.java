import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
              Date current = null;
              Date d1 = null;
              Date d2 = null;
              String InTime = "", OutTime = "", currenttime = "29/10/2019 20:10";

              try {
                     System.out.println("In-time");
                     current = format.parse(currenttime);
                     InTime = sc.nextLine();
                     
                     d1 = format.parse(InTime);
              } catch (ParseException e) {
                     System.out.println(InTime + " is an Invalid In-Time");
                     
                     System.exit(0);
              }
              long diff = current.getTime() - d1.getTime();
              diff = diff / 60000;

              if (diff >= 1) {
                     System.out.println("Out-time");
                     OutTime = sc.nextLine();
                     try {
                           
                           d2 = format.parse(OutTime);
                     } catch (ParseException e) {
                           System.out.println(OutTime + " is an Invalid Out-Time");
                           
                           System.exit(0);
                     }
                     diff = d2.getTime() - d1.getTime();
                     diff = diff / 60000;

                     if (diff >= 1) {
                           System.out.println(((diff / 60 + 1) * 10) + " Rupees");
                           System.exit(0);
                     } else {
                           System.out.println(OutTime + " is an Invalid Out-Time");
                           System.exit(0);
                     }

              } else {
                     System.out.println(InTime + " is an Invalid In-Time");
                     System.exit(0);
              }

       }
}

