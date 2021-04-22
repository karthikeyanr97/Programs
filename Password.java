import java.util.Scanner;

public class Password extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the password:");
		String password = scanner.next();

		boolean result = validatePassword(password);
		System.out.println(result ? "Valid" : "Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validatePassword(String password) {

		if (password.length() < 8)
			return false;

		boolean num = false, special = false, alpha = false;

		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);

			if (c >= '0' && c <= '9')
				num = true;
			else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
				alpha = true;
			else
				special = true;

		}
		return num && special && alpha;
	}
}