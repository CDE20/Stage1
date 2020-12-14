import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        double ltr,dist;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no of liters to fill the tank");
        ltr=sc.nextInt();
        if(ltr<=0)
        {
            System.out.println((int)ltr+" is an Invalid Input");
        }
        else
        {
            System.out.println("Enter the distance covered");
            dist=sc.nextInt();
            
            if(dist<=0)
            {
                System.out.println((int)dist+" is an Invalid Input");
            }
            else
            {
                double liters=(ltr/dist)*100;
                System.out.printf("Liters/100KM\n%.2f",liters);
                
                double miles=dist*0.6214;
                double gallon=ltr*0.2642;
                double ans=miles/gallon;
                System.out.printf("\nMiles/gallons\n%.2f",ans);
            }
        }
    }
}