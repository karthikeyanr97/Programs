import java.util.Scanner;

public class StringProcessing extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		String result = exchangeCharacters(string);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String exchangeCharacters(String string) {

		String modifyStr = "";
		char firstChar = string.charAt(0);
		char lastChar = string.charAt(string.length() - 1);

		modifyStr = lastChar + string.substring(1, string.length() - 1) + firstChar;
		
		return modifyStr;
		// (or) return string.charAt(string.length() - 1) + string.substring(1,string.length() - 1) + string.charAt(0);
	}
}