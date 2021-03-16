import java.util.Scanner;

public class UniqueEvenSum extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int size = scanner.nextInt();

		if (size > 20)
			System.out.println("Array elements existed maximum number of 20");

		System.out.println("Enter the elements:");
		int[] array = new int[size];

		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		int result = addUniqueEven(array);

		if (result == -1)
			System.out.println("no even numbers");
		else
			System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int addUniqueEven(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j])
					array[j] = -1;
			}

			if (array[i] % 2 == 0)
				sum += array[i];
		}

		if (sum == 0)
			return -1;
		else
			return sum;
	}
}