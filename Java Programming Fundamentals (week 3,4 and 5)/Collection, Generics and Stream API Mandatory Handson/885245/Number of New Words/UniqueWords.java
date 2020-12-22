//import the necessary packages if needed
import java.util.*;    
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Student's Article");
       String[] article=sc.nextLine().trim().toLowerCase().split("[,;:.?! ]");
       TreeSet<String> uniquewords=new TreeSet<String>();
       int totalcount=0;
       for(String word : article)
       {
           if(!word.equals(""))
           {
               uniquewords.add(word);
               totalcount++;
           }
       }
       System.out.println("Number of words "+totalcount);
       System.out.println("Number of unique words "+uniquewords.size());
       System.out.println("The words are");
       int index=0;
       for(String word : uniquewords)
       {
           System.out.println(++index+". "+word);
       }
       sc.close();
   }
}