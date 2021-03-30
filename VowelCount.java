import java.util.Scanner;

public class VowelCount extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String:");
		String sentence = scanner.nextLine();

		int result = tellVowelCount(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int tellVowelCount(String sentence) {

		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {

			char c = sentence.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				count++;
			
		}
		return count;
	}
}
