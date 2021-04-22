import java.util.Scanner;

public class ValidatingInputPassword extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the password:");
		String password = scanner.next();

		int result = validatePassword(password);
		System.out.println(result==1 ? "valid" : "invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validatePassword(String password) {

		if (password.length() < 8)
			return -1;

		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);

			if (!((c == '@' || c == '_' || c == '#') && i != 0 && i != password.length() - 1))
				if (!(c >= '0' && c <= '9' && i != 0))
					if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'))
						return -1;
		}
		return 1;
	}
}