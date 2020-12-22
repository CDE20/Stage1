import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
             float lit=in.nextFloat();
          if(lit<=0)
          {
               System.out.println((int)lit+" is an Invalid Input");
               return;
          }
             System.out.println("Enter the distance covered");
             float dis=in.nextFloat();
            if(dis<=0)
            {
                System.out.println((int)dis+" is an Invalid Input");
                return;
            }
              System.out.println("Liters/100KM");
              float a=lit*100/dis;
              System.out.printf("%.2f\n",a);
              System.out.println("Miles/gallons");
              double b=dis*0.6214;
              double c=lit*0.2642;
              double d=(b/c);
              System.out.printf("%.2f",d);
          }
    }
