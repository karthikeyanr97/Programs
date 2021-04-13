import java.util.Scanner;

public class StringProcessing_MixMania extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		boolean result = checkPattern(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean checkPattern(String string) {

		if (string.substring(1, 3).equalsIgnoreCase("ix"))
			if (string.charAt(0) >= 'a' && string.charAt(0) <= 'z' || string.charAt(0) >= 'A' && string.charAt(0) <= 'Z' || string.charAt(0) >= '0' && string.charAt(0) <= '9')
				return true;

		return false;
	}
}