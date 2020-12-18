import java.io.File;
import java.util.Scanner;
public class FileDemo
{
    public static void main(String[] args)
    {
        try{
            File file = new File("log.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}