//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //System.out.println("Enter Student's Article");
        String msg=sc.nextLine();
        msg=msg.toLowerCase();
        String[] words=msg.split("[\\s,:;!.?]+");
        System.out.println("Number of words "+words.length);
        List<String> wlist= new ArrayList<>();
        Map<String,Integer> wordcount= new HashMap<>();
        TreeSet<String> sortset= new TreeSet<>();
        for(String s:words){
            if(wordcount.keySet().contains(s)){
                int value=wordcount.get(s);
                value++;
                wordcount.put(s,new Integer(value));
            }
            else{
                wordcount.put(s,new Integer(1));
                sortset.add(s);
            }
        }
        System.out.println("Words with the count");
        Set<String> set=wordcount.keySet();
       
       // Collections.sort(set);
        for(String str:sortset){
        System.out.println(str+ ": "+wordcount.get(str));
        }
    }
}