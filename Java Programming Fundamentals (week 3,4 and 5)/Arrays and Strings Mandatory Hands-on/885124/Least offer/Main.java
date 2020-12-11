import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws IOException{
     Scanner sc=new Scanner(System.in);
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     String items[] = new String[n];
     int price[] = new int[n];
     int discount[] = new int[n];
     for(int i=0; i<n; i++){
         String s[] = br.readLine().split(",");
         items[i] = s[0];
         price[i] = Integer.parseInt(s[1]);
         discount[i] = Integer.parseInt(s[2]);
     }
     int dis[] = new int[n];
     for(int i=0; i<n; i++){
         dis[i] = (price[i]*discount[i])/100;
     }
     int idx[] = new int[n];
     int j=0;
     int min = Integer.MAX_VALUE;
     for(int i=0; i<n; i++){
         if(dis[i] <= min){
             min = dis[i];
             idx[j++] = i;
         }
     }
     for(int i=0; i<j; i++)
     System.out.println(items[idx[i]]);
    }
}
