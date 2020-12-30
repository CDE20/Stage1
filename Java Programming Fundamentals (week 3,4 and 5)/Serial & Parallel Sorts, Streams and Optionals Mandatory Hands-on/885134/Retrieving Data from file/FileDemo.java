import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try 
        {
            
            File file = new File("log.txt"); 
  
          BufferedReader br = new BufferedReader(new FileReader(file)); 
          
          String st; 
          while ((st = br.readLine()) != null) 
          {
            System.out.println(st); 
          } 
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}