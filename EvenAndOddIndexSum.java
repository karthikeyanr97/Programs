import java.util.Scanner;

public class EvenAndOddIndexSum extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the positive number:");
		int number = scanner.nextInt();

		int result = sumOfOddEvenPositioned(number);
		if (result == 1)
			System.out.println("yes");
		else
			System.out.println("no");

		scanner.close();
	}
}

class UserMainCode {

	public static int sumOfOddEvenPositioned(int number) {

		int evenSum = 0;
		int oddSum = 0;
		int count = 0;

		while (number > 0) {

			if (count % 2 == 0) {

				int remainder = number % 10;
				evenSum += remainder;
				number /= 10;

			} else if (count % 2 != 0) {

				int remainder = number % 10;
				oddSum += remainder;
				number /= 10;

			}
			count++;
		}

		if (evenSum == oddSum)
			return 1;
		else
			return -1;
	}
}