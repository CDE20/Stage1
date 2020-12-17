import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args)
    {
        try {
			FileInputStream fis = new FileInputStream("log.txt");
			FileReader fr = new FileReader("log.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}