import java.util.Scanner;

public class BoundaryAverage extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		float result = getBoundaryAverage(array);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static float getBoundaryAverage(int[] array) {

		float low = array[0];
		float high = array[0];

		if (array[0] > 10)
			return -1;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > 10)
				return -1;

			if (low > array[i])
				low = array[i];
			else if (high < array[i])
				high = array[i];
		}
		return (low + high) / 2;
	}
}