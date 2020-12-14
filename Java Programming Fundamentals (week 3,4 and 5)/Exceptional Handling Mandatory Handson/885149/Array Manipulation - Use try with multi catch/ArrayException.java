import java.util.*;
public class ArrayException{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        ArrayException ae= new ArrayException();
        String msg=ae.getPriceDetails();
        System.out.println(msg);
        
    }
    public String getPriceDetails(){
        try{
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the price details");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter the index of the array element you want to access");
        int ind=sc.nextInt();
    
            String str="The array element is "+arr[ind];
            return str;
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
        
    }
}