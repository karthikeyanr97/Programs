import java.util.Scanner;

public class LeapYear extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date in DD/MM/YYYY format:");
		String date = scanner.next();

		boolean result = isLeapYear(date);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean isLeapYear(String date) {

		int yr = Integer.parseInt(date.substring(6, 10));

		if (yr % 400 == 0)
			return true;
		else if (yr % 100 == 0)
			return false;
		else if (yr % 4 == 0)
			return true;
		else
			return false;
	}
}