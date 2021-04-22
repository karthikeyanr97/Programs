import java.util.Scanner;

public class SequenceSum extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int result = getFibonacciSum(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getFibonacciSum(int number) {

		int a = 0, b = 1, sum = 0;

		for (int i = 0; i < number; i++) {

			int c = a + b;
			sum += a;
			a = b;
			b = c;

		}
		return sum;
	}
}