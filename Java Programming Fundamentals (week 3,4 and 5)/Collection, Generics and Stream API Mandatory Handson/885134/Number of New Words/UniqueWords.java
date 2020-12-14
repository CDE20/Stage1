//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main (String[] args) {
        /* code */
    
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Student's Article");
         String line=sc.nextLine();
         line=line.replaceAll("[,;:.?!]*", "");
        // System.out.println(line);
         String line1=line.toLowerCase();
         
        String[] words = line1.split(" ");
         System.out.println("Number of words "+words.length);
         
         
         HashSet<String> set=new HashSet<String>();  
         for(int i=0;i<words.length;i++)
         {
             set.add(words[i]);
         }
         
         System.out.println("Number of unique words "+set.size());
         System.out.println("The words are");
         List<String> list = new ArrayList<String>(set); 
         Collections.sort(list); 
        
         Iterator<String> itr=list.iterator();  
         int i=0;
          while(itr.hasNext())
          {  
              i++;
            System.out.println(i+". "+itr.next());  
          }  
    }
}