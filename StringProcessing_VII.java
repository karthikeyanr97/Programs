import java.util.Scanner;

public class StringProcessing_VII extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String firstStr = scanner.nextLine();

		System.out.println("Enter the first string:");
		String secondStr = scanner.nextLine();

		System.out.println("Enter the nth character:");
		int n = scanner.nextInt();

		boolean result = isEqual(firstStr, secondStr, n);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean isEqual(String firstStr, String secondStr, int n) {

		char c1 = firstStr.charAt(n - 1);
		char c2 = secondStr.charAt(secondStr.length() - n);

		if (c1 == c2)
			return true;
		else if (c1 >= 'a' && c1 <= 'z' && c2 >= 'A' && c2 <= 'Z' && c1 == (char) (c2 + 32))
			return true;
		else if (c1 >= 'A' && c1 <= 'Z' && c2 >= 'a' && c2 <= 'z' && c1 == (char) (c2 - 32))
			return true;
		else
			return false;
		
	}
}