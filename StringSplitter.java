import java.util.Scanner;

public class StringSplitter extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String sentence = scanner.nextLine();

		System.out.println("Enter the delimiter:");
		char delimiter = scanner.next().charAt(0);

		String[] result = manipulateLiteral(sentence, delimiter);
		for (int i = 0; i < result.length; i++)
			if (result[i] != null)
				System.out.println(result[i]);

		scanner.close();
	}
}

class UserMainCode {

	public static String[] manipulateLiteral(String sentence, char delimiter) {

		String[] stringArr = new String[sentence.length() / 2];
		int i = 0;
		int count = 0;

		while (i < sentence.length()) {

			String s = "";

			while (i < sentence.length() && sentence.charAt(i) != delimiter)
				s += sentence.charAt(i++);

			String revLowStr = "";
			for (int j = s.length() - 1; j >= 0; j--) {

				if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
					revLowStr += (char) (s.charAt(j) + 32);
				else
					revLowStr += s.charAt(j);

			}
			stringArr[count++] = revLowStr;
			i++;
		}
		return stringArr;
	}
}