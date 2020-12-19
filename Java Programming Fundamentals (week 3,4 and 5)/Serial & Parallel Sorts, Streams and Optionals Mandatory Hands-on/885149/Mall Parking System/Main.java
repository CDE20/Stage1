import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		// Fill the Code
		Scanner sc = new Scanner(System.in);
		System.out.println("In-time");
		String inTime = sc.nextLine();
		String regex = "^([0-9]{2})/([0-9]{2})/[0-9]{4}\\s\\d\\d:\\d\\d$";
		if (inTime.matches(regex)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			LocalDateTime actualInTime = LocalDateTime.parse(inTime, formatter);
			LocalDateTime timeNow = LocalDateTime.parse("29/10/2019 20:10", formatter);
			timeNow = timeNow.minusMinutes(1);
			if (actualInTime.isBefore(timeNow)) {
				System.out.println("Out-time");
				String outTime = sc.nextLine();
				if (outTime.matches(regex)) {
					LocalDateTime actualOutTime = LocalDateTime.parse(outTime, formatter);

					timeNow = actualInTime.plusMinutes(1);
					if (actualOutTime.isAfter(timeNow)) {
						Duration duration = Duration.between(actualInTime, actualOutTime);
						long min = duration.toMinutes();
						long hrs = min - min % 60;
						hrs = hrs / 60;
						if (min % 60 == 0) {
							System.out.println(hrs * 10 + " Rupees");
						} else {
							System.out.println((hrs + 1) * 10 + " Rupees");
						}
					} else {
						System.out.println(outTime + " is an Invalid Out-Time");
					}
				}
				else
					System.out.println(outTime + " is an Invalid Out-Time");
			} else {
				System.out.println(inTime + " is an Invalid In-Time");
			}
		} else {
			System.out.println(inTime + " is an Invalid In-Time");
		}

	}
}