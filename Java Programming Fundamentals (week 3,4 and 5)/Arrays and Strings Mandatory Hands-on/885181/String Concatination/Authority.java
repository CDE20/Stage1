import java.util.*;

public class Authority {
    public static boolean check(char[] s)
    {
        for(char c: s)
        {
            if(c == ' ')
                continue;
            if(!Character.isLetter(c))
            {
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        String resident, father;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        resident = sc.nextLine();
        System.out.println("Inmate's father's name:");
        father = sc.nextLine();
        char[] r = resident.toCharArray();
        char[] f = father.toCharArray();
        if(check(r) || check(f))
        {
            System.out.println("Invalid name");
        }
        else
        {
            System.out.println(resident.toUpperCase().concat(" ").concat(father.toUpperCase()));
        }
    }
    
}