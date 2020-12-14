import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner sc  = new Scanner(System.in);
       String vehicleNumber = sc.nextLine();
       String modelName = sc.nextLine();
       String vehicleType = sc.nextLine();
       long vehiclePrice = sc.nextLong();
       Vehicle obj = new Vehicle(vehicleNumber, modelName, vehicleType, vehiclePrice);
       
       double insurance = obj.takeInsurance();
       double loan = obj.issueLoan();
       System.out.println("vehicleType is "+obj.getVehicleType()+",  the eligible loan amount is "+loan);
       System.out.println("insurance amount is "+insurance);
    }
}