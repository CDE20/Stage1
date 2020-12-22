import java.util.*;
class AsciValue{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digits:");
         for(int i=1;i<=4;i++){
             int a=in.nextInt();
             System.out.printf("%d-%c\n",a,a);
         }
    }
}