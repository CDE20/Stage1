import java.util.Scanner;
public class Placement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        System.out.println("Enter the no of students placed in CSE:");
        input[0] = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        input[1] = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        input[2] = sc.nextInt();
        int flag = 0;
        if (input[0] < 0 || input[1] < 0 || input[2] < 0) {
            System.out.println("Input is Invalid");
            flag = 1;
        } else if (input[0] == input[1] && input[1] == input[2]) {
            System.out.println("None of the department has got the highest placement");
            flag = 1;
        }
        /*
        if (cse > ece) {
            if (cse > mech) {
                output = cse;
            } else {
                output = mech;
            }
        } else if (ece > mech) {
            output = ece;
        } else {
            output = mech;
        }*/
        if (flag == 0) {
            System.out.println("Highest placement");
            int max = input[0];
            for (int i = 0; i < 3; i++) {
                if (max < input[i]) {
                    max = input[i];
                }
            }
            
            if (input[0] == max)
                System.out.println("CSE");
            if (input[1] == max) 
                System.out.println("ECE");
            if (input[2] == max) 
                System.out.println("MECH");
            
        }
    }
}