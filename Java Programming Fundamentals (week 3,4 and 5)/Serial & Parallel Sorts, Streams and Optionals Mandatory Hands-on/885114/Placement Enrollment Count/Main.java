import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNumbers = sc.nextLine();
		
		System.out.println("Enter the department name acronym");
		String deptAcronym = sc.nextLine();
		
		int count = getCount(getRollNumbers(rollNumbers), deptAcronym);
		
		if (count > 0) {
			System.out.println("Number of students in " + deptAcronym + " is " + count);			
		
		} else {
			System.out.println("No students from " + deptAcronym);
		}

		

	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		// Fill your code here
		String[] array = rollNumbers.split(",");

		Stream<String> stream = Stream.of(array);

//		Stream<String> stream2 = Arrays.stream(array);

		return stream;
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		// Fill your code here

		long count = rollNumberStream.filter(i -> i.toLowerCase().contains(dept.toLowerCase()))
									.count();

		return (int) count;
	}

}
