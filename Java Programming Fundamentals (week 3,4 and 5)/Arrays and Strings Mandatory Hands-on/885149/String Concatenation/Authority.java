import java.util.*;
class Authority{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=sc.nextLine();
        System.out.println();
        System.out.print("Inmate's father's name:");
        String f_Name=sc.nextLine();
        char ch;
        String jointName=name+" "+f_Name;
        jointName=jointName.toUpperCase();
        
        for(int i=0;i<jointName.length();i++){
            ch=jointName.charAt(i);
            if(ch==' '||Character.isLetter(ch)){
                continue;
            }
            else{
                jointName="Invalid name";
            }
        }
        System.out.println();
        
        System.out.println(jointName);
    }
}