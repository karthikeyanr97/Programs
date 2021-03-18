import java.util.Scanner;

public class Anagram extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first word:");
		String firstWord = scanner.nextLine().toLowerCase();
		System.out.println("Enter the second word:");
		String secondWord = scanner.nextLine().toLowerCase();

		int result = getAnagram(firstWord, secondWord);
		if (result == 1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

		scanner.close();
	}
}

class UserMainCode {

	public static int getAnagram(String firstWord, String secondWord) {

		if (firstWord.length() != secondWord.length())
			return -1;

		String firstWordSorted = "";
		String secondtWordSorted = "";

		char[] firstCharArray = new char[firstWord.length()];
		char[] seondCharArray = new char[secondWord.length()];

		for (int i = 0; i < firstCharArray.length && i < seondCharArray.length; i++) {

			for (int j = 0; j < firstCharArray.length && j < seondCharArray.length - 1; j++) {

				if (firstCharArray[j] > firstCharArray[j + 1]) {

					char firstSwap = firstCharArray[j];
					firstCharArray[j] = firstCharArray[j + 1];
					firstCharArray[j + 1] = firstSwap;

				}

				if (seondCharArray[j] > seondCharArray[j + 1]) {

					char secondSwap = firstCharArray[j];
					seondCharArray[j] = seondCharArray[j + 1];
					seondCharArray[j + 1] = secondSwap;

				}
			}

		}

		for (int i = 0; i < firstCharArray.length && i < seondCharArray.length; i++) {

			firstWordSorted += firstCharArray[i];
			secondtWordSorted += seondCharArray[i];

		}

		if (firstWordSorted.equals(secondtWordSorted))
			return 1;
		else
			return -1;
	}
}