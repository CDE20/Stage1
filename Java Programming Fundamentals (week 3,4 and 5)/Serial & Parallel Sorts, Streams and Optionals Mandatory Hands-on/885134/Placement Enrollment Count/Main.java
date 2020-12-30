import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String str=sc.next();
		System.out.println("Enter the department name acronym");
		String dept=sc.next();
		//String acronym=dept.toLowerCase();
		str=str.toLowerCase();
		Stream<String> rollNumberStream=Main.getRollNumbers(str);
		int count=Main.getCount(rollNumberStream,dept);
		if(count!=0) {
			System.out.println("Number of students in " +dept+" is "+count);
		}
		else
			System.out.println("No students from "+dept);

	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		String[] arr=rollNumbers.split(",");
		return Arrays.stream(arr);

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		
		long count=rollNumberStream.filter(s->s.substring(0,2).equalsIgnoreCase(dept)).count();
		return (int)count;

	}

}

