import java.util.Scanner;

public class StringProcessing_V extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		String result = returnLastRepeatedCharacters(string, number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String returnLastRepeatedCharacters(String string, int number) {

		String result = "";

		for (int i = 0; i < number; i++) {

			result += string.substring(string.length() - number, string.length());
		}
		return result;
	}
}