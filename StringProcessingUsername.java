import java.util.Scanner;

public class StringProcessingUsername extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String userName = fetchUserName(string);
		System.out.println(userName);

		scanner.close();
	}
}

class UserMainCode {

	public static String fetchUserName(String string) {

		String userName = "";

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == '@')
				break;

			userName += string.charAt(i);
		}
		return userName;
	}
}