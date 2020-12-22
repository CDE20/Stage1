import java.util.*;
import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try
        {
            File f=new File("log.txt");
            Scanner reader = new Scanner(f);
            if(reader.hasNextLine())
            {
                System.out.println(reader.nextLine());
            }
        } 
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}