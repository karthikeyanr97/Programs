import java.util.Scanner;

public class StringProcessingZigZag extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date in DD-MM-YYYY format:");
		String date = scanner.nextLine();

		int dayOfMon = getLastDayOfMonth(date);
		System.out.println(dayOfMon);

		scanner.close();
	}
}

class UserMainCode {

	public static int getLastDayOfMonth(String date) {

		int yr = Integer.parseInt(date.substring(6, 10));
		int mon = Integer.parseInt(date.substring(3, 5));

		boolean isLeap = yr % 400 == 0 ? true : yr % 100 == 0 ? false : yr % 4 == 0 ? true : false;

		switch (mon) {

		case 1:
			return 31;
		case 2:
			return isLeap ? 29 : 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;

		}
		return -1;
	}
}