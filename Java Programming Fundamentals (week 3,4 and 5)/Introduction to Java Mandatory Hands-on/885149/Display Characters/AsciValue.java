//package tekstac;
import java.io.*;
public class AsciValue {
		public static void main(String[] args) throws IOException{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the digits");
			int a=Integer.parseInt(in.readLine());
			int b=Integer.parseInt(in.readLine());
			int c=Integer.parseInt(in.readLine());
			int d=Integer.parseInt(in.readLine());
			
			System.out.println(a+"-"+(char)a);
			System.out.println(b+"-"+(char)b);
			System.out.println(c+"-"+(char)c);
			System.out.println(d+"-"+(char)d);
		
	}
}
