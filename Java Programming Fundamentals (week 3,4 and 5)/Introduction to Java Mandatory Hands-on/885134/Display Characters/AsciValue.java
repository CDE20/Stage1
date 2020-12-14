import java.util.*;
public class AsciValue
{
    public static void main (String[] args) {
        /* code */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int arr[]=new int[4];
        
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            char a=(char)arr[i];
            System.out.println(arr[i]+"-"+a);
        }
        
    }
}