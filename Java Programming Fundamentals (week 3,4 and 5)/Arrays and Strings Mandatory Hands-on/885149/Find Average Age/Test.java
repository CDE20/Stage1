import java.io.*;
public class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total no.of employees:");
        int n=Integer.parseInt(in.readLine());
        if(n>=2){
            System.out.println("Enter the age for "+n+" employees:");
            int ages[]=new int[n];
            int age=0;
            boolean flag=true;
            for(int i=0;i<n;i++){
                age=Integer.parseInt(in.readLine());
                if(age>=28&&age<=40){
                    ages[i]=age;
                }
                else{
                    
                    System.out.println("Invalid age encountered!");
                    flag=false;
                    break;
                }
            }
            if(flag){
                double avg=calculateAverage(ages);
                System.out.printf("The average age is %.2f",avg);
            }
            
        }
        
        else{
            System.out.println("Please enter a valid employee count");
        }
    }
    
    public static double calculateAverage(int[] age){
        double sum=0;
        double avg=0;
        for(int i=0;i<age.length;i++){
            sum=sum+age[i];
        }
       // System.out.println(age.length);
        avg=sum/age.length;
        return avg;
    }
}








