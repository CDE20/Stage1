import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
        System.out.println("Enter all roll numbers separated by comma");
		String rollNumbers = sc.nextLine();
		System.out.println("Enter the department name acronym");
		String department = sc.next();
		Stream<String> rollNumberStream = getRollNumbers(rollNumbers);
		int count = getCount(rollNumberStream, department);
		if (count > 0)
			System.out.println("Number of students in " + department + " is " + count);
		else
			System.out.println("No students from " + department);


	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
        List<String> rollNosList = Arrays.asList(rollNumbers.split(","));
        return rollNosList.stream();

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
        
        return (int)rollNumberStream.filter(r -> r.substring(0,2).equalsIgnoreCase(dept)).count();

	}

}
