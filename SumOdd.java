import java.util.Scanner;

public class SumOdd extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int result = addOddNumbers(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int addOddNumbers(int number) {

		int sum = 0;

		for (int i = 0; i <= number; i++) {

			if (i % 2 != 0)
				sum += i;

		}
		return sum;
	}
}