import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollString = sc.next();
		Stream<String> rollNumberStream = getRollNumbers(rollString);
		System.out.println("Enter the department name acronym");
		String dept = sc.next();
		int count = getCount(rollNumberStream, dept);
		if(count > 0)
			System.out.println("Number of students in "+dept+" is "+count);
		else
			System.out.println("No students from "+dept);
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		String[] rollNo  = rollNumbers.split(",");
		List<String> list = Arrays.asList(rollNo);
		return list.stream();
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		int count = 0;
		List<String> list = rollNumberStream.collect(Collectors.toList());
		for(String s : list) {
			if(s.substring(0, 2).equalsIgnoreCase(dept))
				count++;
		}
		return count;
	}

}
