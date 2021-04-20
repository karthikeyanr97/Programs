import java.util.Scanner;

public class ColorCodeValidation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the colorCode:");
		String colorCode = scanner.next(); 

		boolean result = validateColourCode(colorCode);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validateColourCode(String colorCode) {

		if (colorCode.length() != 7 || colorCode.charAt(0) != '#')
			return false;

		int count = 0;

		for (int i = 1; i < colorCode.length(); i++) {

			if (colorCode.charAt(i) >= 'A' && colorCode.charAt(i) <= 'F' || colorCode.charAt(i) >= '0' && colorCode.charAt(i) <= '9')
				count++;

		}
		return count == 6;
	}
}