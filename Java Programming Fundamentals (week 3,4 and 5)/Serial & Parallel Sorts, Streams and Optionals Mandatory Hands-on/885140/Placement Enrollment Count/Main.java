import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNo = sc.nextLine();
		Stream<String> rollNumbers = getRollNumbers(rollNo.toLowerCase());
		System.out.println("Enter the department name acronym");
		String acronym = sc.next();
		int count = getCount(rollNumbers, acronym.toLowerCase());
		if(count>0)
			System.out.print("Number of students in " + acronym + " is " + count);
		else
			System.out.println("No students from " + acronym);

	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		String[] split = rollNumbers.split(",");
		
		List<String> list = Arrays.asList(split);
		
		Stream<String> stream = list.stream();
		return stream;
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		long count = rollNumberStream.filter(s->s.substring(0,2).equalsIgnoreCase(dept)).count();
		return (int)count;

	}

}
