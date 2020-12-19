import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollnums=sc.nextLine();
		System.out.println("Enter the department name acronym");
		String acm=sc.nextLine();
		Stream<String> rollnumstream=Main.getRollNumbers(rollnums);
		int c=Main.getCount(rollnumstream,acm);
		if(c>0){
		    System.out.println("Number of students in "+acm+" is "+c);
		}
		else{
		    System.out.println("No students from "+acm);
		}


	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		String rollno[]=rollNumbers.split(",");
		return Stream.of(rollno);

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		long cnt=0;
		//String dep=dept.substring(0,2);
		cnt=rollNumberStream.filter(s->s.substring(0,2).equalsIgnoreCase(dept)).count();
		return (int)cnt;


	}

}
