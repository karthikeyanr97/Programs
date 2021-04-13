import java.util.Scanner;

public class StringProcessing4 extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		System.out.println("Enter the nth number character:");
		int n = scanner.nextInt();

		String result = getStringUsingNthCharacter(string, n);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getStringUsingNthCharacter(String string, int n) {

		String result = "";
		int pos = 0;

		for (int i = 0; i < string.length(); i++) {

			if (i + 1 == 1 || i + 1 == pos) {

				result += string.charAt(i);
				pos += n;
			}
		}
		return result;
	}
}