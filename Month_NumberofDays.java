import java.util.Scanner;

public class Month_NumberofDays extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = scanner.nextInt();

		System.out.println("Enter the month:");
		int mon = scanner.nextInt();

		int day = getNumberOfDays(year, mon);
		System.out.println(day);

		scanner.close();
	}
}

class UserMainCode {

	public static int getNumberOfDays(int year, int mon) {

		switch (mon) {

		case 0: return 31;
		case 1: return (year % 400 == 0) ? 29 : (year % 100 == 0) ? 28 : (year % 4 == 0) ? 29 : 28;
		case 2: return 31;
		case 3: return 30;
		case 4: return 31;
		case 5: return 30;
		case 6: return 31;
		case 7: return 31;
		case 8: return 30;
		case 9: return 31;
		case 10:return 30;
		case 11:return 31;

		}
		return -1;
	}
}