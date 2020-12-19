import java.io.*;

public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=null;
        
        fis=new FileInputStream("log.txt");
        int data;
        while((data=fis.read()) != -1){
            System.out.print((char)data);
        }
        
        fis.close();
    }
}