import java.util.Scanner;

public class LargestSpan extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();

		int result = getLargestSpan(array);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getLargestSpan(int[] array) {

		int maxCount = 0;
		int maxNumber = 0;

		for (int i = 0; i < array.length; i++) {

			int count = 0;

			if (array[i] == -1)
				continue;

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					count++;
					array[j] = -1;

				}
			}

			if (i == 0) {

				maxCount = count;
				maxNumber = array[i];

			}

			if (maxCount < count) {

				maxCount = count;
				maxNumber = array[i];
			}
		}
		return maxNumber;
	}
}