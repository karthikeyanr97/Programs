import java.util.Scanner;

public class CharacterCleaning extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String:");
		String word = scanner.next();

		System.out.println("Enter the character:");
		char chr = scanner.next().charAt(0);

		String result = removeCharacter(word, chr);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String removeCharacter(String word, char chr) {

		String result = "";

		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) != chr)
				result += word.charAt(i);

		return result;
	}
}