import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNos = sc.next();
		System.out.println("Enter the department name acronym");
		String dept = sc.next();
		int count = getCount(getRollNumbers(rollNos), dept);
		if (count > 0)
			System.out.println("Number of students in " + dept + " is " + count);
		else
			System.out.println("No students from " + dept);
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		// Fill your code here
		List<String> rollNos = Arrays.asList(rollNumbers.split(","));
		return rollNos.stream();
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		// Fill your code here
		return (int) rollNumberStream.filter(r -> r.substring(0, 2).equalsIgnoreCase(dept)).count();
	}

}
