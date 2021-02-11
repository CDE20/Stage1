import java.util.Scanner; 
public class AsciValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[4];
        System.out.println("Enter the digits:");
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + "-" + (char)input[i]);
        }
    }
}