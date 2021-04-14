import java.util.Scanner;

public class StringProcessing5 extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		String[] array = new String[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < size; i++)
			array[i] = scanner.next();

		String result = concatString(array);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String concatString(String[] array) {

		String result = "";

		for (int i = 0; i < array.length; i++) {

			result += array[i];

			if (i != array.length - 1)
				result += ",";

		}
		return result;
	}
}