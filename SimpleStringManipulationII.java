import java.util.Scanner;

public class SimpleStringManipulationII extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		int result = calculateWordSum(sentence);
		if (result == 0)
			System.out.println("Sentence reached max 100 characters");
		else
			System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int calculateWordSum(String sentence) {

		if (sentence.length() > 100)
			return 0;

		String word[] = sentence.split(" ");

		if (word[0].equals(word[word.length - 1]))
			return word[0].length();
		else
			return word[0].length() + word[word.length - 1].length();

	}
}
