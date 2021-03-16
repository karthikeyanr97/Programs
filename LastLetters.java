import java.util.Scanner;

public class LastLetters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = getLastLetter(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getLastLetter(String sentence) {

		String result = "";
		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {

			char character = ' ';

			if (sentence.charAt(i) == ' ') {

				if (sentence.charAt(i - 1) >= 'a' && sentence.charAt(i - 1) <= 'z')
					character = (char) (sentence.charAt(i - 1) - 32);
				else
					character = sentence.charAt(i - 1);

				count++;

				if (count > 1)
					result += "$" + character;
				else
					result += character;

			} else if (i == sentence.length() - 1) {

				if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z')
					result += "$" + (char) (sentence.charAt(i) - 32);
				else
					result += "$" + sentence.charAt(i);

			}
		}
		return result;
	}
}