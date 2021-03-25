import java.util.Scanner;

public class SumNonPrimeNumbers extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the positive integer number:");
		int endRange = scanner.nextInt();

		int result = validateNumber(endRange);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int validateNumber(int endRange) {

		int sum = 0;

		for (int i = 1; i <= endRange; i++) {

			if (i == 1) {
				sum += i;
				continue;
			}

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					sum += i;
					break;
				}

			}
			
		}
		return sum;
	}
}