import java.util.Scanner;

public class PlayingWithString_I extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of string:");
		int size = scanner.nextInt();

		String[] stringArray = new String[size];
		System.out.println("Enter the " + size + " String");
		for (int i = 0; i < size; i++)
			stringArray[i] = scanner.next();

		System.out.println("Enter the which position character to take:");
		int posChar = scanner.nextInt();

		String result = formString(stringArray, posChar);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String formString(String[] stringArray, int posChar) {

		String result = "";

		for (int i = 0; i < stringArray.length; i++) {

			if (stringArray[i].length() == posChar)
				result += stringArray[i].charAt(stringArray[i].length() - 1);
			else if (stringArray[i].length() != posChar)
				result += '$';

		}
		return result;
	}
}