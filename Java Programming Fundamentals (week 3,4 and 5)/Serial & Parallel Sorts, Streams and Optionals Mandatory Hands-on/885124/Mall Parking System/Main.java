import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String [] args) throws Exception {
        Date inDate, outDate, currentDate;
        String in, out;
        long diff, diffMinutes;
        int cost;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        currentDate = sdf.parse("29/10/2019 20:10");
        System.out.println("In-time");
        in = sc.nextLine();
        try {
            inDate = sdf.parse(in);
        } catch(Exception e) {
            System.out.println(in + " is an Invalid In-Time");
            return;
        }
        if(inDate.compareTo(currentDate) >= 0) {
            System.out.println(sdf.format(inDate) + " is an Invalid In-Time");
            return;
        }
        System.out.println("Out-time");
        out = sc.nextLine();
        try{
            outDate = sdf.parse(out);
        } catch(Exception e) {
            System.out.println(out + " is an Invalid Out-Time");
            return;
        }
        if(outDate.compareTo(inDate) <= 0) {
            System.out.println(sdf.format(outDate) + " is an Invalid Out-Time");
            return;
        }
        diff = outDate.getTime() - inDate.getTime();
        diffMinutes = TimeUnit.MILLISECONDS.toMinutes(diff);
        if(diffMinutes <= 60) {
                cost = 10;
        } else {
            int diffHours = (int) (diffMinutes / 60);
            cost = 10 * diffHours;
            if(diffMinutes % 60 > 0) {
                cost+= 10;
            }
        }
        System.out.println(cost + " Rupees");
        sc.close();
    }
}