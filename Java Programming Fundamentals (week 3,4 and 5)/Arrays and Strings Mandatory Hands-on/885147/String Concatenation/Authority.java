import java.util.*;

public class Authority{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fatherName=sc.nextLine();
        
        if(name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") && fatherName.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*")){
            name=name.toUpperCase();
            fatherName=fatherName.toUpperCase();
            System.out.println(name.concat(" ").concat(fatherName));
        }
        else{
            System.out.println("Invalid name");
        }
    }
}