import java.util.Scanner;

public class StringsProcessingReplication extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String string = scanner.nextLine();

		System.out.println("Enter the nth time repeat:");
		int n = scanner.nextInt();

		String result = repeatString(string, n);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String repeatString(String string, int n) {

		String str = "";

		for (int i = 0; i < n; i++)
			str += string;

		return str;
	}
}