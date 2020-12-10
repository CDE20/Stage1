import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] items = new String[n];
        int minDiscount = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            items[i] = sc.next();
            String[] item = items[i].split(",");
            int temp = Integer.parseInt(item[1])*Integer.parseInt(item[2])/100;
            if(temp<minDiscount)
                minDiscount=temp;
        }
        for(int i=0; i<n; i++)
        {
            String[] item = items[i].split(",");
            int temp = Integer.parseInt(item[1])*Integer.parseInt(item[2])/100;
            if(temp == minDiscount)
                System.out.println(item[0]);
        }
     
     
        
    }
}