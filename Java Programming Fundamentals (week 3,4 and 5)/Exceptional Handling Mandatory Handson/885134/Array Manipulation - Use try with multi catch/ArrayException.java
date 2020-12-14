import java.util.*;

public class ArrayException
{
    public static void main (String[] args) 
    {
        ArrayException a=new ArrayException();
        System.out.print("\n"+a.getPriceDetails());
    }
    public String getPriceDetails()
    {
        Scanner s= new Scanner(System.in);
        try
        {
            System.out.println("Enter the number of elements in the array");
            int n=s.nextInt();
            System.out.println("\nEnter the price details");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            System.out.println("\nEnter the index of the array elements you want to access");
            int element=s.nextInt();
            return "The array element is "+arr[element];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return "Array index is out of range";
        }
        catch(InputMismatchException e)
        {
            return "Input was not in the correct format";
        }
    }
    
}