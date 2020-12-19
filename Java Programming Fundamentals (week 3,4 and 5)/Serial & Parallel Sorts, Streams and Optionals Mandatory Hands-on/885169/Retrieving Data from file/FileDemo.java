import java.io.File;
import java.util.Scanner;
public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        File file=new File("log.txt");
        Scanner sc=new Scanner(file);
        
        while(sc.hasNextLine())
        System.out.println(sc.nextLine());
        
    }
}