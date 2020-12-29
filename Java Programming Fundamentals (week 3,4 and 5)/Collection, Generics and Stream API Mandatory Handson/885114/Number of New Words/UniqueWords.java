//import the necessary packages if needed
import java.util.Scanner;
import java.util.*;

@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main (String[] args) {
        System.out.println("Enter Student's Article");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] words = input.split("[ ,;:.?!]+");
        Set<String> set = new HashSet<String>();
        
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            set.add(words[i]);
        }
        
        System.out.println("Number of words " + words.length);

        System.out.println("Number of unique words " + set.size());
        
        
        
        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        
        System.out.println("The words are");
        int i = 1;
        for (String word: sortedList) {
            System.out.println(i++ + ". " + word);
        }
    }
}