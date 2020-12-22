import java.util.*;
import java.util.Scanner;
public class Authority
{
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int i,count=0;
    System.out.println("Inmate's name:");
    String a=in.nextLine();
    String ab=a.toUpperCase();
    System.out.println("Inmate's father's name:");
    String b=in.nextLine();
    String cb=b.toUpperCase();
    char[] charArray=ab.toCharArray();
    char[] chararray1=cb.toCharArray();
    for(i=0;i<charArray.length;i++)
    {
           if(!(charArray[i]>='A'&&charArray[i]<='Z'||charArray[i]==' '))
           {
              System.out.println("Invalid name");
              count=0;
              break;
             }
        }
        if(i==charArray.length)
        {
            count=1;
        }
            if(count==1)
            {
              for(i=0;i<chararray1.length;i++)
               {
                  if(!(chararray1[i]>='A'&&chararray1[i]<='Z'||chararray1[i]==' '))
                    {
                      System.out.print("Invalid name");
                      break;
                     }
                }
                if(i==chararray1.length)
                  {
                     count=2;
                   }
            }
           if(count==2)
           {
             System.out.print(ab+" "+cb);
           }
     }
}
 