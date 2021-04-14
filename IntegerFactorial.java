import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class IntegerFactorial extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();

		HashMap<Integer, Integer> result = getFactorial(array);
		for (Entry<Integer, Integer> entry : result.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());

		scanner.close();
	}
}

class UserMainCode {

	public static HashMap<Integer, Integer> getFactorial(int[] array) {

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int i : array) {

			int factorial = 1;

			for (int j = 1; j <= i; j++) {

				factorial *= j;

			}
			hashmap.put(i, factorial);
		}
		return hashmap;
	}
}