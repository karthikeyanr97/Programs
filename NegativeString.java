import java.util.Scanner;

public class NegativeString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = negativeString(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String negativeString(String string) {

		int length = string.length();
		int indexOfIs = string.indexOf("is ");

		String modifiedStr = string.substring(0, indexOfIs + 3) + "not " + string.substring(indexOfIs + 3, length);

		return modifiedStr;

	}
}