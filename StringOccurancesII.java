import java.util.Scanner;

public class StringOccurancesII extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st String:");
		String str1 = scanner.nextLine();
		System.out.println("Enter the 2nd String:");
		String str2 = scanner.nextLine();

		int result = getSubstring(str1, str2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getSubstring(String str1, String str2) {

		if (str1.length() > 100 || str2.length() > 100) {
			System.out.println("Strings reached maximum size of 100 characters");
			return 0;
		}

		int count = 0;
		int len = str2.length();
		for (int i = 0; i <= str1.length() - str2.length(); i++, len++) {

			if (str2.equals(str1.substring(i, len)))
				count++;

		}
		return count;
	}
}