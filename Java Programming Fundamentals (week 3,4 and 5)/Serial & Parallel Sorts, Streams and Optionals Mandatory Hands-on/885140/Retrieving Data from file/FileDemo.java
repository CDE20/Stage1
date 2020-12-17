import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args)
    {
       
    	FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("C:\\Users\\NAKOOL\\Desktop\\eclipse-jee-2020-03-R-incubation-win32-x86_64\\eclipse\\Tekstac\\Retrieving Data from file\\log.txt");
			int data;
	    	try {
				while((data = fis.read()) !=-1) {
					System.out.print((char)data);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	finally {
    	try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    }
}