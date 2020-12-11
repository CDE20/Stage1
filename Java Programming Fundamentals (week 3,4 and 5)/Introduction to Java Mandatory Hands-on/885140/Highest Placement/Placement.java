import java.util.Scanner;

class Placement{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		int CSE = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		int ECE = sc.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		int MECH = sc.nextInt();
		
		if(CSE == ECE && CSE == MECH) {
			System.out.println("None of the department has got the highest placement");
		}
		else if(CSE<0 || ECE<0 || MECH<0) {
			System.out.println("Input is Invalid");
		}
		else {
			System.out.println("Highest placement");
			if(CSE>=ECE && CSE>=MECH) {
				if(CSE == ECE) {
					System.out.println("CSE\nECE" );
				}
				else if(CSE == MECH) {
					System.out.println("CSE\nMECH");
				}
				else {
					System.out.println("CSE");
				}
			}
			else if(ECE>=CSE && ECE>=MECH) {
				if(CSE == ECE) {
					System.out.println("CSE\nECE" );
				}
				else if(ECE == MECH) {
					System.out.println("ECE\nMECH");
				}
				else {
					System.out.println("ECE");
				}
				
			}
			else if(MECH>=CSE && MECH>=ECE) {
				if(MECH == CSE) {
					System.out.println("CSE\nMECH" );
				}
				else if(ECE == MECH) {
					System.out.println("ECE\nMECH");
				}
				else {
					System.out.println("MECH");
				}
				
			}
			
		}
	}
}