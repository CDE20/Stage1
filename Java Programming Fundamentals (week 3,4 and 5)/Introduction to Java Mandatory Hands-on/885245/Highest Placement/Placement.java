import java.util.*;
class Placement{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE: ");
        int a=in.nextInt();
        System.out.println("Enter the no of students placed in ECE: ");
         int b=in.nextInt();
        System.out.println("Enter the no of students placed in MECH: ");
        int c=in.nextInt();
        if(a<0||b<0||c<0){
            System.out.println("Input is Invalid");
        }
        else if(a==b&&b==c||a==0&&b==0&&c==0){
            System.out.println("None of the department has got the highest placement");
        }
        else
        {
             int course=(a>b)?((a>c)?a:c):((b>c)?b:c);
                    System.out.println("Highest placement");
                    if(a==course){
                        System.out.println("CSE"); 
                    }
                    if(b==course){
                        System.out.println("ECE");
                    }
                    if(c==course){
                        System.out.println("MECH");
                    }
        }
    }
}
                