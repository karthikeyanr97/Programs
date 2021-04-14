import java.util.Scanner;

public class RegularExpression_III extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		boolean result = validateString(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validateString(String string) {

		return string.charAt(0) >= '0' && string.charAt(0) <= '9' ? false : true;

	}
}