import java.util.Scanner;

public class ArrayListManipulation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the Array:");
		int size = scanner.nextInt();

		int[] firstArray = new int[size];
		int[] secondArray = new int[size];
		System.out.println("Enter the 1st array " + size + " elements:");
		for (int i = 0; i < size; i++)
			firstArray[i] = scanner.nextInt();
		System.out.println("Enter the 2nd array " + size + " elements:");
		for (int i = 0; i < size; i++)
			secondArray[i] = scanner.nextInt();

		int[] result = generateOddEvenList(firstArray, secondArray);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

		scanner.close();
	}
}

class UserMainCode {

	public static int[] generateOddEvenList(int[] firstArray, int[] secondArray) {

		int[] result = new int[firstArray.length];

		for (int i = 0; i < firstArray.length && i < secondArray.length; i++)
			if (i % 2 != 0)
				result[i] = firstArray[i];
			else if (i % 2 == 0)
				result[i] = secondArray[i];

		return result;
	}
}