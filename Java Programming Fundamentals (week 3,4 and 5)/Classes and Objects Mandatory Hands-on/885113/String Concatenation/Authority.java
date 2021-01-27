import java.util.*;
import java.lang.*;
class Authority{
    
    public static void main (String[] args) {
        String a,b;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        a=sc.nextLine();
        System.out.println("Inmate's father's name:");
        b=sc.nextLine();
        int asc,asc1;
        for(int i=0;i<a.length();i++){
            asc=a.charAt(i);
            if(asc>=65 && asc<=90){}
            else if(asc>=97 && asc<=122){}
            else if(asc==32){}
            else{
                flag=1;
                break;
                }
        }
        for(int i=0;i<b.length();i++){
            asc=b.charAt(i);
            if(asc>=65 && asc<=90){}
            else if(asc>=97 && asc<=122){}
            else if(asc==32){}
            else{
                flag=1;
                break;
                }
        }

        
        b=a.concat(" "+b);
        
        if(flag==0)
        System.out.println(b.toUpperCase());
    if(flag==1)
        System.out.println("Invalid name");
            }
}