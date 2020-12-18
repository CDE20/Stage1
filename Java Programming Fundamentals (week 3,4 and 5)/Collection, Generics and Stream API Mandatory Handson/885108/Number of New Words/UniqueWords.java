import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class UniqueWords {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String input = sc.nextLine();
		input = input.replaceAll("[,:;.?!]", "");
		input = input.toLowerCase();
		String[] words = input.split(" ");
		System.out.println("Number of words "+(words.length));
		List<String> words1 = Arrays.asList(words);
		SortedSet<String> unique_words = new TreeSet<>(words1);
		System.out.println("Number of unique words "+unique_words.size());
		int count = 1;
		System.out.println("The words are");
		for(String s: unique_words) {
			System.out.println(count++ + ". "+s);
		}
	}
}
