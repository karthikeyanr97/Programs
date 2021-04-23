import java.util.Scanner;

public class CommonElements extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array1 = new int[size];
		int[] array2 = new int[size];

		System.out.println("Enter the elements for 1st array:");
		for (int i = 0; i < array1.length; i++)
			array1[i] = scanner.nextInt();

		System.out.println("Enter the elements for 2nd array:");
		for (int i = 0; i < array2.length; i++)
			array2[i] = scanner.nextInt();

		int result = sumCommonElements(array1, array2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int sumCommonElements(int[] array1, int[] array2) {

		int sum = 0;

		if (array1.length > 20 || array2.length > 20)
			return -1;

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {

					sum += array1[i];
					array1[i] = -1;

				}
			}
		}
		return sum != 0 ? sum : -1;
	}
}