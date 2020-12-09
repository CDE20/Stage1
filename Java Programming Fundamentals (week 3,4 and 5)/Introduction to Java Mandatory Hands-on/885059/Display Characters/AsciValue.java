import java.util.*;
public class AsciValue {
    public static void main (String[] args) {
        int ar[];
        ar = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        for(int i=0; i<4; i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int i=0; i<4; i++)
        {
            System.out.printf("%d-%c\n",ar[i],ar[i]);
        }
    }
}