import java.util.Scanner;

public class SwapCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String:");
		String word = scanner.nextLine();

		String result = swapCharacter(word);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String swapCharacter(String word) {

		String result = "";

		for (int i = 0; i < word.length(); i++) {

			if (i % 2 != 0)
				result = result + word.charAt(i) + word.charAt(i - 1);
			else if (i == word.length() - 1)
				result = result + word.charAt(i);

		}
		return result;
	}
}