//import the necessary packages if needed
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
@SuppressWarnings("unchecked")//Do not delete this line


public class UniqueWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String input=sc.nextLine();
		input=input.replaceAll("[^a-zA-Z'\\s]", "");
		input=input.toLowerCase();
		String arr[]=input.split(" ");
		List<String> l=Arrays.asList(arr);
		System.out.println("Number of words "+arr.length);
		//Set<String> hset=new HashSet<String>(l);
		Set<String> set=new TreeSet<String>(l);
		System.out.println("Number of unique words "+set.size());
		System.out.println("The words are");
		int i =1;
		for(String s:set) {
			System.out.println(i+". "+s);
			i++;
		}
		//System.out.println(input);
	}
}
