import java.util.Scanner;

public class FlushCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = getSpecialChar(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getSpecialChar(String string) {

		String result = "";

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' '))
				result += c;
		}
		return result;
	}
}