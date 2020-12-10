import java.util.Scanner;

public class Placement {
	
	public static void calculate(int cse, int ece, int mech) {
		
		if(cse>=0&&ece>=0&&mech>=0) {
			if(cse==ece&&ece==mech) {
				System.out.println("None of the department has got the highest placement");
				return;
			}
			else {
				int max=cse;
				if(ece>max)
					max=ece;
				if(mech>max)
					max=mech;
				System.out.println("Highest placement");
				if(cse==max)
					System.out.println("CSE");
				if(ece==max)
					System.out.println("ECE");
				if(mech==max)
					System.out.println("MECH");
				return;
			}
		}else {
			System.out.println("Input is Invalid");
			return;
		}
	}
	
	
	public static void main(String[] args) {
		int cse=0, ece=0, mech=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		cse=sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		ece=sc.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		mech=sc.nextInt();
		calculate(cse, ece, mech);
	}
	
}
