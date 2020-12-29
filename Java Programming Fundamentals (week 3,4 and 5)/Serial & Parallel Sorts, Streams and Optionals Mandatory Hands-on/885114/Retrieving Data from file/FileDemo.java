import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        
        try {
			fis = new FileInputStream(new File("log.txt"));
			
			int d = 0;
			while ((d = fis.read()) != -1) {
				System.out.print((char) d);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}