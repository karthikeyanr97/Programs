import java.util.Scanner;

public class CountVowels extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		int result = countVowels(string);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static int countVowels(String string) {

		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				count++;
		}
		return count;
	}
}