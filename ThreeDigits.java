import java.util.Scanner;

public class ThreeDigits extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String:");
		String string = scanner.nextLine();

		int result = validatestrings(string);
		if (result == 1)
			System.out.println("Valid ");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validatestrings(String string) {

		for (int i = 0; i < string.length(); i++) {

			if (!(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' && i < 3))
				if (!(string.charAt(i) == '-' && i == 3))
					if (!(string.charAt(i) >= '0' && string.charAt(i) <= '9' && i > 3 && i <= 6))
						return -1;

		}
		return 1;
	}
}
