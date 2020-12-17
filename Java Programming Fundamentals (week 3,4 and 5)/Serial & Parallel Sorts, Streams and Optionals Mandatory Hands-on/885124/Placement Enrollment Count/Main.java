import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		String rollNo;
		String deptName;
		Scanner sc = new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		rollNo = sc.nextLine();
		Stream<String> s=getRollNumbers(rollNo);
		System.out.println("Enter the department name acronym");
		deptName = sc.nextLine();
		int c = getCount(s, deptName);
		if (c == 0) {
			System.out.println("No students from " + deptName);
		} else {
			System.out.println("Number of students in me is " + c);

		}

	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		// Fill your code here
		List<String> alist = new ArrayList<>();
		String s[] = rollNumbers.split(",");

		for (int i = 0; i < s.length; i++) {
			alist.add(s[i]);
		}

		return alist.stream();
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		// Fill your code here

		ArrayList<Integer> list = new ArrayList<>();
		rollNumberStream.forEach(a -> {

			if (a.toLowerCase().contains(dept.toLowerCase())) {
				list.add(1);
			}
		});
		return list.size();

	}
}
