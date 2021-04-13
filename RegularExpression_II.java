import java.util.Scanner;

public class RegularExpression_II extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		boolean result = validateString(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validateString(String string) {

		if (string.length() != 3)
			return false;

		for (int i = 0; i < string.length(); i++) {

			if (!(string.charAt(i) >= 'a' && string.charAt(i) <= 'z' || string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'))
				return false;

		}
		return true;
	}
}