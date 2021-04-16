import java.util.Scanner;

public class MonthName extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter date in the format dd-mm-yy:");
		String date = scanner.next();

		String month = getMonthName(date);
		System.out.println(month);

		scanner.close();
	}
}

class UserMainCode {

	public static String getMonthName(String date) {

		int mon = Integer.parseInt(date.substring(3, 5));

		switch(mon) {
		
		case 1: return "JANUARY";
		case 2: return "FEBRUARY";
		case 3: return "MARCH";
		case 4: return "APRIL";
		case 5: return "MAY";
		case 6: return "JUNE";
		case 7: return "JULY";
		case 8: return "AUGUST";
		case 9: return "SEPTEMBER";
		case 10:return "OCTOBER";
		case 11:return "NOVEMBER";
		case 12:return "DECEMBER";

		}
		return "date is irrelevant";
	}
}