//import the necessary packages if needed
     import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
         public static void main(String[]  args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Student's Article");
             String str=sc.nextLine();
             str=str.trim();
             str=str.toLowerCase();
             String[] article=str.split("[\\s,:;!.?]+");
             int numOfWords=article.length;
             TreeSet<String> set=new TreeSet<String>();
              int q=0;
             for(int i=0;i<numOfWords;i++){
                 String word=article[i];
                 set.add(word);
                 if(word.length()<=1){
                     q++;
                 }
             }
             
            /* int uw=0;
             if(q==0){
                 uw=set.size();
                 System.out.println("Number of words "+(numOfWords-q));
             }
             else{
                 System.out.println("Number of words "+(numOfWords-q+1));
                 uw=set.size()-1;
             }*/
             System.out.println("Number of words "+article.length);
             System.out.println("Number of unique words "+set.size());
             System.out.println("The words are");
            int j=1;
           for(String s:set){
              
                 System.out.println((j)+". "+s);
                 j++;
                 /* if(q==0){
               }
               else{
                   if(j>0){
                   System.out.println(j+". "+s);
                   }
                   j++;
               }*/
               
                 
             }
             //System.out.println();
         }
}