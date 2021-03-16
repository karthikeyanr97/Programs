import java.util.Scanner;

public class CheckFirstAndLastWord extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		int result = checkFirstAndLastWord(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int checkFirstAndLastWord(String sentence) {

		String word[] = sentence.split(" ");

		if (word[0].equals(word[word.length - 1]))
			return word[0].length();
		else
			return word[0].length() + word[word.length - 1].length();

	}
}