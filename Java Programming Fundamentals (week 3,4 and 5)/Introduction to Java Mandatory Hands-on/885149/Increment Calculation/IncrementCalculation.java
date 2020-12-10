import java.util.*;
class IncrementCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double rating=sc.nextDouble();
        int percent=0,total=0;
        if(salary<=0||(rating<=0||rating>5)){
            System.out.println("Invalid Input");
        }
        else{
            if(rating>=1&&rating<=3){
                percent=10;
            }
            else if(rating>=3.1&&rating<=4){
                percent=25;
            }
            else if(rating>=4.1&&rating<=5){
                percent=30;
            }
            
            total=(int)((salary*percent)/100);
            total=total+salary;
            System.out.println(total);
        }
    }
}