import java.util.Scanner;

public class RepeatingSetcharactersString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.next();

		System.out.println("Enter the nth number of characters:");
		int n = scanner.nextInt();

		String result = getString(string, n);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getString(String string, int n) {
		
		for (int i = 0; i < n; i++)
			string+=string.substring(string.length()-n);
		
		return string;
	}
}