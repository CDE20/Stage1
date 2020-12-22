import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int i;
     int input=sc.nextInt();
     String array[]=new String[input];
     int max=2147483647;
     for(i=0;i<input;i++)
     {
         String s=sc.next();
         String[] newarray=s.split(",");
         int discount=(Integer.parseInt(newarray[1])*Integer.parseInt(newarray[2]))/100;
         array[i]=newarray[0]+","+Integer.toString(discount);
         if(max>discount)
         {
             max=discount;
         }
     }
     for(i=0;i<input;i++)
     {
         String str[]=array[i].split(",");
         if(Integer.parseInt(str[1])==max)
         {
            System.out.println(str[0]);
         }
     }
    }
}