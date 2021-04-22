import java.util.Scanner;

public class SumSquaresofDigits extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the integer number:");
		int number = scanner.nextInt();

		int result = getSumOfSquaresOfDigits(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getSumOfSquaresOfDigits(int number) {

		int sum = 0;

		while (number > 0) {

			int remainder = number % 10;
			int sqr = remainder * remainder;

			sum += sqr;
			number /= 10;

		}
		return sum;
	}
}