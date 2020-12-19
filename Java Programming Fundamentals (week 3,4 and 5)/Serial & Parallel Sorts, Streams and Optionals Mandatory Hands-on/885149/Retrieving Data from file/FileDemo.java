import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try(FileReader fr=new FileReader("log.txt");){
        
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char) i);
        }
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch(IOException e){
            System.out.println("I/O Exerption");
        }
        
    }
}