import java.util.Scanner;

public class ConvertFormat extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the colorCode:");
		String string = scanner.next();

		String result = convertFormat(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String convertFormat(String string) {

		String modifiedStr = "";

		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) >= '0' && string.charAt(i) <= '9' && count < 2) {

				modifiedStr += string.charAt(i);
				count++;

			} else if (string.charAt(i) != '-') {

				modifiedStr += "-" + string.charAt(i);

				if (i < 5)
					count = 1;
				else
					count = 0;

			}
		}
		return modifiedStr;
	}
}