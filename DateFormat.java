import java.util.Scanner;

public class DateFormat extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two date in format DD-MM-YYYY:");
		String date1 = scanner.next();
		String date2 = scanner.next();

		String oldDate = findOldDate(date1, date2);
		System.out.println(oldDate);

		scanner.close();
	}
}

class UserMainCode {

	public static String findOldDate(String date1, String date2) {

		if (date1.length() != 10 && date2.length() != 10)
			return "Invalid date";

		int start = 6;
		int end = date1.length();

		while (start >= 0) {

			int locDate = 0;

			if ((locDate = Integer.parseInt(date1.substring(start, end))) < Integer.parseInt(date2.substring(start, end)))
				return date1.substring(3, 5) + "/" + date1.substring(0, 2) + "/" + locDate;

			else if (Integer.parseInt(date1.substring(start, end)) > (locDate = Integer.parseInt(date2.substring(start, end))))
				return date2.substring(3, 5) + "/" + date2.substring(0, 2) + "/" + locDate;

			if (end == date1.length()) {
				start -= 3;
				end -= -5;
			} else if (end != date1.length()) {
				start -= 3;
				end -= 3;
			}

		}
		return date1.substring(3, 5) + "/" + date1.substring(0, 2) + "/" + date1.substring(6, 10);
	}
}
