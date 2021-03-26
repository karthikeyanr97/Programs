import java.util.Scanner;

public class ValidDate extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date:");
		String date = scanner.next();

		int result = validateDate(date);
		if (result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validateDate(String date) {

		if (date.length() != 10 || date.charAt(2) != '.' && date.charAt(2) != '-')
			if (date.charAt(2) != '/' || date.charAt(5) != '/' || date.length() != 8)
				return -1;

		for (int i = 0; i < date.length(); i++) {

			if (!(date.charAt(i) >= '0' && date.charAt(i) <= '9' && (i < 2 || i > 2 && i < 5 || i > 5 && i < date.length())))
				if (!((date.charAt(i) == '.' || date.charAt(i) == '/' || date.charAt(i) == '-') && (i == 2 || i == 5)))
					return -1;

		}
		return 1;
	}
}