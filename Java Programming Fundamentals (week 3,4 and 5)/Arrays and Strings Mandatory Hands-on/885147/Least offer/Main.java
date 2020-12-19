import java.util.*;
public class Main
{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
    int N=sc.nextInt();
    String s;
    String[] product=new String[N];
    int[] price=new int[N];
    int[] discount=new int[N];
    for (int i = 0; i < N; i++) 
    {
    	s=sc.next();
    	String[] split=s.split(",");
    	
    	int count=0;
    	product[i]=split[count++];
    	price[i]=Integer.parseInt(split[count++]);
    	discount[i]=Integer.parseInt(split[count++]);
	}
    
    int[] discountPrice=new int[N];
    for(int i=0;i<N;i++)
    {
    	discountPrice[i]=(discount[i] * price[i])/100;
    }
    int min=9999;
    for(int i=0;i<N;i++)
    {
    	if(discountPrice[i]<min)
    	{
    		min=discountPrice[i];
    	}
    }
    for(int i=0;i<N;i++)
    {
    	if(min==discountPrice[i])
    	{
    		System.out.println(product[i]);
    	}
    }
     
    }
}