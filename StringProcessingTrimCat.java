import java.util.Scanner;

public class StringProcessingTrimCat extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = getAlternateChars(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getAlternateChars(String string) {

		String result = "";

		for (int i = 0; i < string.length(); i++) {

			if (i % 2 == 0)
				result += string.charAt(i);

		}
		return result;
	}
}