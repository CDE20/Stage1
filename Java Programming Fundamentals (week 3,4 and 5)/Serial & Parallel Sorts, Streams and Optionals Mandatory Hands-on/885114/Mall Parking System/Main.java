import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double minutes = 0;
		String input = "";
		String output = "In";
		Scanner sc = new Scanner(System.in);
		String format = "dd/MM/yyyy HH:mm";

		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			LocalDateTime systemDateTime = LocalDateTime.parse("29/10/2019 20:10", formatter);

			System.out.println("In-time");
			input = sc.nextLine();
			LocalDateTime inTime = LocalDateTime.parse(input, formatter);
			minutes = ChronoUnit.MINUTES.between(inTime, systemDateTime);

			if (minutes <= 0) {
				System.out.println(input + " is an Invalid In-Time");
				return;
			}

			output = "Out";
			System.out.println("Out-time");
			input = sc.nextLine();
			LocalDateTime outTime = LocalDateTime.parse(input, formatter);

			minutes = ChronoUnit.MINUTES.between(inTime, outTime);

			if (minutes <= 0) {
				System.out.println(input + " is an Invalid Out-Time");
				return;
			}

			long charge = (long) (Math.ceil(minutes / 60) * 10); // hours * 10

			System.out.println(charge + " Rupees");
		} catch (Exception e) {
			System.out.println(input + " is an Invalid " + output + "-Time");
		}

	}
}