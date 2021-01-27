import java.util.*;
class AsciValue{
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        
        char A,B,C,D;
        A=(char)a;
        B=(char)b;
        C=(char)c;
        D=(char)d;
        
        System.out.println(a+"-"+A);
        System.out.println(b+"-"+B);
        System.out.println(c+"-"+C);
        System.out.println(d+"-"+D);
        
    }
}