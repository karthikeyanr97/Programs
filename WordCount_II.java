import java.util.Scanner;

public class WordCount_II extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		int result = countWord(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int countWord(String string) {

		int count = 1;

		for (int i = 0; i < string.length() - 1; i++) {

			if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
				count++;
		}
		return count;
	}
}