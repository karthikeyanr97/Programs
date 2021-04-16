import java.util.Scanner;

public class ArrayFront extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();

		boolean result = scanArray(array);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean scanArray(int[] array) {

		for (int i = 0; i < array.length && i < 4; i++) {

			if (array[i] == 9)
				return true;

		}
		return false;
	}
}