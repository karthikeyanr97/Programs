import java.util.Scanner;

public class SumDigitsString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");
		String word = scanner.nextLine();

		int result = sumOfDigits(word);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int sumOfDigits(String word) {

		int result = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
				result += Integer.parseInt(String.valueOf(word.charAt(i)));

			}
		}
		if (result == 0)
			return -1;
		else
			return result;
	}
}