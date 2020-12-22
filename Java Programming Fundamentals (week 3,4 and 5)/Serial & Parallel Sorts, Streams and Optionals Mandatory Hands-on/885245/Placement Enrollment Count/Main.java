import java.util.Scanner;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String input=sc.nextLine().trim();
		System.out.println("Enter the department name acronym");
		String deptName=sc.next();
		int Count=getCount(getRollNumbers(input),deptName);
		if(Count>0)
		{
		    System.out.println("Number of students in "+deptName+" is "+Count);
		}
		else
		{
		    System.out.println("No students from "+deptName);
		}
	}
	public static Stream<String> getRollNumbers(String rollNumbers)
	{
		//Fill your code here
        return Stream.of(rollNumbers.split(","));

	}
	public static int getCount(Stream<String> rollNumberStream, String dept) 
	{
		//Fill your code here
		return (int) rollNumberStream.filter(rollNum -> dept.equalsIgnoreCase(rollNum.substring(0,2))).count();
	}

}
