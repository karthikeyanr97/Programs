import java.util.Scanner;

public class RegularExpression1 extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		boolean result = validate(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validate(String string) {

		if (string.length() < 5)
			if ((string.charAt(0) >= 'a' && string.charAt(0) <= 'z') || (string.charAt(2) >= '0' && string.charAt(2) <= '9'))
				if (string.charAt(1) >= 'A' && string.charAt(1) <= 'Z')
					if (string.charAt(2) >= '0' && string.charAt(2) <= '9')
						return true;

		return false;
	}
}