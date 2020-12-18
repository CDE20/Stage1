import java.io.*;
public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("log.txt");
        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
        }
    }
}