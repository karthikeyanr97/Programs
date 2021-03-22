import java.util.Scanner;

public class ColorCode extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the color code:");
		String colorCode = scanner.next();

		int result = validateColorCode(colorCode);
		if (result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validateColorCode(String colorCode) {

		if (colorCode.length() != 7)
			return -1;

		if (colorCode.charAt(0) != '#')
			return -1;

		for (int i = 1; i < colorCode.length(); i++) {

			if (!(colorCode.charAt(i) >= '0' && colorCode.charAt(i) <= '9'))
				if (!(colorCode.charAt(i) >= 'A' && colorCode.charAt(i) <= 'F'))
					return -1;

		}
		return 1;
	}
}
