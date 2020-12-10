import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of liters to fill the tank");
        double liters=Integer.parseInt(in.readLine());
        if(liters<=0){
            System.out.println((int)liters+" is an Invalid Input");
        }
        else{
        System.out.println("Enter the distance covered");
        double distance=Integer.parseInt(in.readLine());
        if(distance<=0){
            System.out.println((int)distance+" is an Invalid Input");
        }
        else{
        double ltpkm=(liters/distance)*100;
        
        double miles=distance*0.6214;
        double gallon=liters*0.2642;
        
        double miles_per_galon=miles/gallon;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f",ltpkm);
        System.out.println();
        System.out.println("Miles/gallons");
        System.out.printf("%.2f",miles_per_galon);
        }
        }
    }
}