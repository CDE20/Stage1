import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//import the necessary packages if needed
     
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article ");
		String line = sc.nextLine();
		
		
		String copy = line.toLowerCase();
		String arr[] = copy.split("[,:;.?!]");
		String finalString = "";
		for(int i = 0;i<arr.length;i++) {
			arr[i] = arr[i].trim();
			finalString += arr[i] + " ";
		}
		arr = finalString.split(" ");
		System.out.println("Number of words " + arr.length);
		List<String> list = Arrays.asList(arr);
		Set<String> set = new TreeSet<>(list);
		System.out.println("Number of unique words " + set.size());
		int i = 1;
		System.out.println("The words are");
		for (String string : set) {
			System.out.println( i + ". " + string);
			i++;
		}
		/*System.out.println(finalString);
		for ( String string : arr) {
			System.out.println(string);
		}
		*/
	}
         
}