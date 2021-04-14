import java.util.Scanner;

public class StringRepetition extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		String result = repeatString(string, number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String repeatString(String string, int number) {

		String result = "";

		if (number >= 3) {

			for (int i = 0; i < number; i++)
				result += string.substring(0, 3) + " ";

		} else if (number == 2) {

			for (int i = 0; i < number; i++)
				result += string.substring(0, 2) + " ";

		} else if (number == 1) {

			result += string.charAt(0);

		}
		return result;
	}
}