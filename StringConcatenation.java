import java.util.Scanner;

public class StringConcatenation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first word:");
		String firstWord = scanner.next();

		System.out.println("Enter the second word:");
		String secondWord = scanner.next();

		String result = concatstring(firstWord, secondWord);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String concatstring(String firstWord, String secondWord) {

		if (firstWord.length() > secondWord.length())
			return firstWord.substring(firstWord.length() - secondWord.length()) + secondWord;
		else if (firstWord.length() < secondWord.length())
			return firstWord + secondWord.substring(secondWord.length() - firstWord.length());
		else
			return firstWord + secondWord;

	}
}