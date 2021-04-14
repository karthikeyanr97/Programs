import java.util.Scanner;

public class AgeForVoting extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date of birth (dd/MM/yyyy):");
		String date = scanner.next();

		String currDate = "01/01/2015";

		String result = getAge(date, currDate);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getAge(String date, String currDate) {

		int age = 0;

		int yr = Integer.parseInt(date.substring(6, 10));
		int mon = Integer.parseInt(date.substring(3, 5));
		int day = Integer.parseInt(date.substring(0, 2));

		int currYr = Integer.parseInt(currDate.substring(6, 10));
		int currMon = Integer.parseInt(currDate.substring(3, 5));
		int currDay = Integer.parseInt(currDate.substring(0, 2));

		if (currYr > yr)
			age = currYr - yr;
		else
			return "not-eligible";

		if (mon > currMon)
			age -= 1;
		else if (mon == currMon && day > currDay)
			age = -1;

		return age >= 18 ? "eligible" : "not-eligible";
	}
}