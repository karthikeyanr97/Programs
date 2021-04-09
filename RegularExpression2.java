import java.util.Scanner;

public class RegularExpression2 extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the age:");
		String age = scanner.next();

		boolean result = ValidateAge(age);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean ValidateAge(String age) {

		int i = 0;
		while (i < age.length())
			if (!(age.charAt(i) >= '0' && age.charAt(i++) <= '9'))
				return false;

		return Integer.parseInt(age) >= 21 && Integer.parseInt(age) <= 41;

	}
}