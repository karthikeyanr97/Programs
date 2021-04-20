import java.util.Scanner;

public class StringProcessing extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two strings:");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();

		String result = getCombo(string1, string2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getCombo(String string1, String string2) {

		if (string1.length() > 100 || string2.length() > 100)
			return "String reached max of 100 characters";

		if (string1.length() > string2.length())
			return string1 + string2 + string1;
		else if (string1.length() < string2.length())
			return string2 + string1 + string2;
		else
			return "";

	}
}