import java.util.Scanner;

public class SimpleStringManipulation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = getString(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getString(String string) {

		if (string.length() > 100)
			return "String reached max of 100 characters";

		String modifiedStr = "";

		for (int i = 0; i < string.length(); i++) {

			if (i == 0 && string.charAt(i) == 'j')
				modifiedStr += string.charAt(0);
			else if (i == 1 && string.charAt(i) == 'b')
				modifiedStr += string.charAt(0);
			else if (i != 0 && i != 1)
				modifiedStr += string.charAt(i);

		}

		return modifiedStr;
	}
}