import java.util.Scanner;

public class EvenSumDuplicateElements extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		int result = sumElements(array);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int sumElements(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == -1)
				continue;

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j])
					array[j] = -1;
			}
			if (array[i] % 2 == 0)
				sum += array[i];
		}
		return sum != 0 ? sum : -1;
	}
}