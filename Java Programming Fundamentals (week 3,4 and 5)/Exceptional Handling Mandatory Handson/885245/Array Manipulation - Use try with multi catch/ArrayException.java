import java.util.*;
public class ArrayException
{
    public String getPriceDetails()
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the number of elements in array");
            int number=sc.nextInt();
            System.out.println("Enter the price details");
            int price[]=new int[number];
            for(int i=0;i<number;i++)
            {
                price[i]=sc.nextInt();
            }
            System.out.println("Enter the index of array element you want to access");
            int index=sc.nextInt();
            return("The array element is "+price[index]);
        }
        catch(InputMismatchException e)
        {
            return("Input was not in the correct format");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return("Array index is out of range");
        }
            
    }
    public static void main(String args[])
    {
        ArrayException arrayexception=new ArrayException();
        System.out.println(arrayexception.getPriceDetails());
    }
}