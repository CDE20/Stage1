import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try {
			FileReader fr=new FileReader("log.txt");
			int data;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}