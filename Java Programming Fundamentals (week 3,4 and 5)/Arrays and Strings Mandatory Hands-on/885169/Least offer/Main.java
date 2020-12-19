import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
      int n = sc.nextInt();
     String name[]= new String[n];
    int price[]=new int[n];
    int discount[]=new int[n];
    String input;
    String x[];
    
    for(int i=0 ; i<n ; i++)
    {
        input = sc.next();
       x=input.split(",");
       name[i]=x[0];
       price[i]=Integer.parseInt(x[1]);
       discount[i]=Integer.parseInt(x[2]);
    }
  int y=0;
  int min=(price[0]*discount[0])/100;
  for(int j=0; j<n; j++)
  {
      y=(price[j]*discount[j])/100;
      discount[j]=y;
      if(y<min)
    {
        min=y;
    }
  }
     for (int k=0; k<n; k++)   
     {
         if(discount[k]==min)
         System.out.println(name[k]);
     }
    
        
    }
}