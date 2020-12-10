import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Placement{
    public static void main(String[] args) throws IOException{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of students placed in CSE:");
        int cse=Integer.parseInt(in.readLine());
        
        System.out.println("Enter the no of students placed in ECE:");
        int ece=Integer.parseInt(in.readLine());
        
        System.out.println("Enter the no of students placed in MECH:");
        int mech=Integer.parseInt(in.readLine());
        
        if(cse<0||ece<0||mech<0){
            System.out.println("Input is Invalid");
        }
        else{
            if(cse==ece&&ece==mech){
                System.out.println("None of the department has got the highest placement");
            }
            else{
                if(cse>=ece&&cse>=mech){
                    if(cse==ece){
                        System.out.println("Highest Placement");
                        System.out.println("CSE");
                        System.out.println("ECE");
                    }
                    else if(cse==mech){
                        System.out.println("Highest Placement");
                        System.out.println("CSE");
                        System.out.println("MECH");
                    }
                    else {
                        System.out.println("Highest Placement");
                        System.out.println("CSE");
                    }
                }
                else if(ece>=cse&&ece>=mech){
                    if(ece==mech){
                        System.out.println("Highest Placement");
                        System.out.println("ECE");
                        System.out.println("MECH");
                    }
                    else {
                        System.out.println("Highest Placement");
                        System.out.println("ECE");
                    }
                }
                else if (mech>=ece&&mech>=cse){
                    
                        System.out.println("Highest Placement");
                        System.out.println("MECH");

                }
            }
        }
        
    }
}