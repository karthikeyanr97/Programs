import java.util.Scanner;

public class AddAndReverse extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int result = addAndReverse(array, number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int addAndReverse(int[] array, int number) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 15)
				sum += array[i];

		}

		int revNum = 0;

		while (sum > 0) {

			revNum = revNum * 10 + sum % 10;
			sum /= 10;
		}
		return revNum;
	}
}