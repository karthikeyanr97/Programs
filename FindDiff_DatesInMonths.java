import java.util.Scanner;

public class FindDiff_DatesInMonths extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two date strings in yyyy-mm-dd format:");
		String date1 = scanner.next();
		String date2 = scanner.next();

		int result = getMonthDifference(date1, date2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getMonthDifference(String date1, String date2) {

		int date1Yr = Integer.parseInt(date1.substring(0, 4));
		int date1Mon = Integer.parseInt(date1.substring(5, 7));

		int date2Yr = Integer.parseInt(date2.substring(0, 4));
		int date2Mon = Integer.parseInt(date2.substring(5, 7));

		if (date2Yr > date1Yr)
			return (date2Yr - date1Yr) * 12 - date1Mon + date2Mon;
		else if (date2Yr == date1Yr)
			return date2Mon - date1Mon;

		return -1;
	}
}