import java.util.*;
public class AsciValue {
    public static void main(String[] args)
    {
        int i;
        int a[] = new int[5];
         char c[]=new char[4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Digits");
        for(i=0;i<4;i++)
        {
            a[i]=s.nextInt();
            
             
            }
        for(i=0;i<4;i++)
        {
             c[i]=(char)a[i];
             System.out.println(a[i]+"-"+c[i]);
        }
        
        
            
    
    }
}
