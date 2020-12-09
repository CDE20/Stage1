import java.util.Scanner;
public class Placement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] placements = new int[3];
        System.out.println("Enter the no of students placed in CSE:");
        placements[0] = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        placements[1] = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        placements[2] = sc.nextInt();
        int max = placements[0];
        if(placements[0] >= 0 && placements[1] >= 0 && placements[2] >= 0){
            if(placements[0] == placements[1] && placements[1] == placements[2]){
                System.out.println("None of the department has got the highest placement");
            }
            else{
                System.out.println("Highest placement");
                for(int i = 1;i < 3;i++){
                    if(placements[i] > max)
                        max = placements[i];
                }
                for(int i = 0;i < 3;i++){
                    if(placements[i] == max){
                        if(i == 0)
                            System.out.println("CSE");
                        else if(i == 1)
                            System.out.println("ECE");
                        else
                            System.out.println("MECH");
                    }
                }
            }
        }
        else{
            System.out.println("Input is Invalid");
        }
    }
}