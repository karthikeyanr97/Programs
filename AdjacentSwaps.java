import java.util.Scanner;

public class AdjacentSwaps extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = swapPairs(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String swapPairs(String sentence) {

		if (sentence.length() > 100)
			return "Sentence must contains maximum size of 100 characters";

		String swapedString = "";

		for (int i = 0; i < sentence.length(); i++) {

			if (i % 2 != 0)
				swapedString = swapedString + sentence.charAt(i) + sentence.charAt(i - 1);

			else if (i == sentence.length() - 1 && sentence.length() % 2 != 0)
				swapedString += sentence.charAt(i);

		}
		return swapedString;
	}

}