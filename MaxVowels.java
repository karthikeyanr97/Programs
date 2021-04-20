import java.util.Scanner;

public class MaxVowels extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = getWordWithMaximumVowels(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getWordWithMaximumVowels(String string) {

		if (string.length() > 100)
			return "String reached max of 100 characters";

		String words[] = string.split(" ");

		String highVowStr = "";
		int highVow = 0;

		for (int i = 0; i < words.length; i++) {

			int vowCount = 0;

			for (int j = 0; j < words[i].length(); j++) {

				char c = words[i].charAt(j);

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					vowCount++;

			}

			if (highVow < vowCount) {

				highVowStr = words[i];
				highVow = vowCount;

			}
		}
		return highVowStr;
	}
}