import java.util.Scanner;
public class Authority {
    public static void main(String[] args){
        int count=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=sc.nextLine();
        System.out.print("Inmate's father's name:");
        String fname=sc.nextLine();
        
        String s3=name.toUpperCase();
        String s4=fname.toUpperCase();
        
        char[] a1=s3.toCharArray();
        char[] a2=s4.toCharArray();
        
        for(i=0; i<a1.length;i++) {
            if(!(a1[i] >= 'A' && a1[i] <= 'Z' || a1[i] == ' '))
            {
                System.out.print("Invalid name");
                count=0;
                break;
            }
        }
        
        if(i == a1.length){
            count=1;
        }
        if(count==1){
            for(i=0;i<a2.length;i++){
                if(!(a2[i]>='A' && a2[i]<='Z' || a2[i]==' ')){
                    System.out.print("Invalid name");
                    break;
                }
            }
            if(i==a2.length){
                count=2;
            }
        }
        if(count==2){
            System.out.print(s3+ " "+s4);
        }
    }
}