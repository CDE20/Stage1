import java.util.*;

public class AsciValue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int[] digit=new int[4];
        for(int i=0;i<4;i++){
            digit[i]=sc.nextInt();
        }
        
        char[] letter=new char[4];
        for(int i=0;i<4;i++){
            letter[i] = (char)digit[i];
            System.out.println(digit[i]+"-"+letter[i]);
        }
        
        
        System.out.println();
    }
}