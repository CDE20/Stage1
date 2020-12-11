import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

       public static void main(String[] args) {

              // testing with non-empty String
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter Student's Article");
              String input = sc.nextLine();
              input=input.toLowerCase();
              input=input.replaceAll("[^a-zA-Z'\\s_-]", "");
              String[] words = input.split(" ");

              int numOfWords = count(input);
              System.out.println("Number of words " + (numOfWords));

              
              boolean[] array = new boolean[words.length];
              int j, i = 0;
              int count = 0;

              for (i = 0; i < words.length; i++) {
                     if (!array[i]) {
                           count++;
                           for (j = i + 1; j < words.length; j++) {
                                  if (words[j].compareTo(words[i]) == 0) {
                                         array[j] = true;
                                  }
                           }
                     }
              }
              System.out.println("Number of unique words " + (count));
              
              List<String> sList = Arrays.asList(words);
             
             Set<String> set = new HashSet<>(sList);
            
             TreeSet<String> treeSet = new TreeSet<>(set);
             Iterator<String> itr =treeSet.iterator();
            
             System.out.println("The words are");
             for(int j1=1;j1<=count;j1++) {
                 System.out.println(j1+"."+itr.next());
          }


             


       }

       public static int count(String sentence) {
              if (sentence == null || sentence.isEmpty()) {
                     return 0;
              }

              String[] words = sentence.split("\\s+");
              return words.length;
       }

}

