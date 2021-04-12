import java.util.Scanner;

public class OccuranceCount extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		System.out.println("Enter the serach word:");
		String wordSearch = scanner.next();

		int result = countWords(sentence, wordSearch);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int countWords(String sentence, String wordSearch) {

		String[] words = sentence.split(" ");
		int count = 0;

		for (String word : words)
			if (word.equals(wordSearch))
				count++;

		return count;
	}
}