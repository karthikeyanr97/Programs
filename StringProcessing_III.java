import java.util.Scanner;

public class StringProcessing_III extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = moveX(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String moveX(String string) {

		String strLowX = "";
		String str = "";

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == 'x')
				strLowX += string.charAt(i);
			else
				str += string.charAt(i);

		}
		return str + strLowX;
	}
}