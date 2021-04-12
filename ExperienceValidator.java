import java.util.Scanner;

public class ExperienceValidator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the passed out:");
		String passedout = scanner.next();

		System.out.println("Enter the experience:");
		String exp = scanner.next();

		int currentYr = 2015;

		boolean result = validateExp(passedout, exp, currentYr);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean validateExp(String passedout, String exp, int currentYr) {

		if (currentYr - Integer.parseInt(passedout) >= Integer.parseInt(exp))
			return true;
		else
			return false;
	}
}