import java.util.Scanner;
public class Authority
{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fname=sc.nextLine();
        
        if(name.matches("[a-zA-Z ]+"))
        {
            if(fname.matches("[a-zA-Z ]+"))
            {
                String ans=name.toUpperCase()+" "+fname.toUpperCase();
                System.out.println(ans);
            }
            else
                System.out.println("Invalid name");
        }
        else
            System.out.println("Invalid name");
    }
}