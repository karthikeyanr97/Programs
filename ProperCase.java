import java.util.Scanner;

public class ProperCase extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = changeCase(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String changeCase(String sentence) {

		String modifyStr = "";

		if (sentence.charAt(0) >= 'a' && sentence.charAt(0) <= 'z')
			modifyStr += (char) (sentence.charAt(0) - 32);
		else
			modifyStr += (sentence.charAt(0));

		for (int i = 1; i < sentence.length(); i++) {

			if (sentence.charAt(i - 1) == ' ' && sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z')
				modifyStr += (char) (sentence.charAt(i) - 32);
			else
				modifyStr += sentence.charAt(i);

		}
		return modifyStr;
	}
}