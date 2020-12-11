//import the necessary packages if needed
import java.util.*;
     
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String sentence = sc.nextLine();
		String[] sentenceArray = sentence.split(" ");
		System.out.println("Number of words "+sentenceArray.length);
		Set<String> set = new HashSet();
		for(String word: sentenceArray)
		{
			word = (word.replaceAll("[^a-zA-Z0-9']", "")).toLowerCase();  
			set.add(word);
		}
		System.out.println("Number of unique words "+set.size());
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("The words are");
		int i=1;
		for(String s: list)
		{
			System.out.println(i+++". "+s);
		}
	}
         
}