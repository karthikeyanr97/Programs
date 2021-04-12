import java.util.Scanner;

public class RegularExpressions3 extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String string1 = scanner.next();

		System.out.println("Enter the search string:");
		String string2 = scanner.next();

		int formatName = searchString(string1, string2);
		System.out.println(formatName);

		scanner.close();
	}
}

class UserMainCode {

	public static int searchString(String string1, String string2) {

		int len = string2.length();
		int count = 0;

		for (int i = 0; i <= string1.length() - string2.length(); i++, len++) {

			if (string1.substring(i, len).equalsIgnoreCase(string2))
				count++;
		}
		return count;
	}
}