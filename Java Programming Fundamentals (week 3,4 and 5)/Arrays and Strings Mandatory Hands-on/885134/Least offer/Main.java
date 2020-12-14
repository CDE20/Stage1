import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
        int n=sc.nextInt();
        String arr[];
        String line;
        String name[]=new String[n];
        int price[]=new int[n];
        int discount[]=new int[n];
         
        for(int i=0;i<n;i++)
        {
            line=sc.next();
            //System.out.println(line);
            arr=line.split(",");
            name[i]=arr[0];
            price[i]=Integer.parseInt(arr[1]);
            discount[i]=Integer.parseInt(arr[2]);
        }
        
        int temp=0;
        int min=(price[0]*discount[0])/100;
        
        for(int i=0;i<n;i++)
        {
            temp=(price[i]*discount[i])/100;
            discount[i]=temp;
            if(temp<min)
            {
                min=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(discount[i]==min)
            {
                System.out.println(name[i]);
            }
        }
        
    }
}