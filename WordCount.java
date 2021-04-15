import java.util.Scanner;

public class WordCount extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		System.out.println("Enter the " + size + " elements:");

		String[] strArray = new String[size];
		for (int i = 0; i < size; i++)
			strArray[i] = scanner.next();

		System.out.println("Enter the number of characters:");
		int n = scanner.nextInt();

		int result = countWord(strArray, n);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int countWord(String[] strArray, int n) {

		int count = 0;

		for (int i = 0; i < strArray.length; i++) {

			if (strArray[i].length() == n)
				count++;

		}
		return count;
	}
}