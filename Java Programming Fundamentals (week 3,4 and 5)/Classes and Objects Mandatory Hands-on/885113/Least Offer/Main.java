import java.util.*;
import java.io.*;
public class Main{
    public static void main (String[] args)throws IOException {
     InputStreamReader in=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(in);
     int item=Integer.parseInt(br.readLine());
     String[]   temp=new String[item];
     String[][] name=new String[item][4];
     
     StringTokenizer str1;
     int j=0;
     for(int i=0;i<item;i++){
         temp[i]=br.readLine();
     }
     for(int i=0;i<item;i++){
         str1=new StringTokenizer(temp[i],",");
         j=0;
         while(str1.hasMoreTokens()){
             name[i][j]=str1.nextToken();
             j++;
         }}
        int min=50000,ans=0;
        for(int i=0;i<item;i++){
            ans=Integer.parseInt(name[i][1])*Integer.parseInt(name[i][2])/100;
            name[i][3] = String.valueOf(ans);
            if(min>ans)
            min=ans;
        }
        for(int i=0;i<item;i++){
            if(Integer.parseInt(name[i][3])==min){
            System.out.println(name[i][0]);
        }  }
    }
}