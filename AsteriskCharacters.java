import java.util.Scanner;

public class AsteriskCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		boolean result = scanStarNeighbors(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean scanStarNeighbors(String string) {

		int beforeCount = 0;
		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == '*') {
				beforeCount = count;
				count = 0;
			} else
				count++;
		}

		if (beforeCount != count)
			return true;
		else
			return false;
	}
}