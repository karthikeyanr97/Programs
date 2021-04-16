import java.util.Scanner;

public class DateValidation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date:");
		String date = scanner.next();

		int result = getValidDate(date);
		if (result == 1)
			System.out.println("valid");
		else
			System.out.println("invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int getValidDate(String date) {

		for (int i = 0; i < date.length(); i++) {

			if (!(date.charAt(i) >= '0' && date.charAt(i) <= '9' && (i == 0 || i == 1 || i == 3 || i == 4 || i > 5 && i < 10)))
				if (!((date.charAt(i) == '.' || date.charAt(i) == '-' || date.charAt(i) == '/') && (i == 2 || i == 5)))
					return -1;
		}
		return 1;
	}
}