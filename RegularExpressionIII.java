import java.util.Scanner;

public class RegularExpressionIII extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the password:");
		String password = scanner.next();

		String result = passwordValidation(password);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String passwordValidation(String password) {

		if (password.length() < 8)
			return "invalid";

		boolean small = false, caps = false, special = false, numeric = false;

		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);

			if (c >= 'a' && c <= 'z')
				small = true;
			else if (c >= 'A' && c <= 'Z')
				caps = true;
			else if (c >= '0' && c <= '9')
				numeric = true;
			else
				special = true;

		}
		return small && caps && numeric && special ? "valid" : "invalid";
	}
}