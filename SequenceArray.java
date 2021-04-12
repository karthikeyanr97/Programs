import java.util.Scanner;

public class SequenceArray extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int numbers[] = new int[size];
		System.out.println("Enter the " + size + " numbers:");
		for (int i = 0; i < size; i++)
			numbers[i] = scanner.nextInt();

		boolean result = searchSequence(numbers);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean searchSequence(int[] numbers) {

		Loop1: for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 1) {
				int count = 1;

				while (++i < numbers.length) {
					count++;
					if (!(numbers[i] == 2 && count == 2 || numbers[i] == 3 && count == 3))
						continue Loop1;
					else
						return true;
				}
			}
		}
		return false;
	}
}