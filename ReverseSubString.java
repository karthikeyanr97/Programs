import java.util.Scanner;

public class ReverseSubString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		System.out.println("Enter the starting index number:");
		int start = scanner.nextInt();

		System.out.println("Enter the length:");
		int len = scanner.nextInt();

		String result = reverseSubstring(string, start, len);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String reverseSubstring(String string, int start, int len) {

		String subStr = "";

		for (int i = string.length() - start - 1, j = 0; j < len; i--, j++) {

			if (i == -1)
				return "Given length is out of range of String";

			subStr += string.charAt(i);
		}
		return subStr;
	}
}