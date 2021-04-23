import java.util.Scanner;

public class nCr extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st number:");
		int number1 = scanner.nextInt();

		System.out.println("Enter the 2nd number:");
		int number2 = scanner.nextInt();

		int result = calculateNcr(number1, number2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int calculateNcr(int number1, int number2) {

		int factorial1 = 1;
		int factorial2 = 1;
		int factMinus = 1;
		int nCr = 0;

		for (int i = 1; i <= number1; i++)
			factorial1 *= i;

		for (int i = 1; i <= number2; i++)
			factorial2 *= i;

		for (int i = 1; i <= number1 - number2; i++)
			factMinus *= i;

		nCr = factorial1 / (factorial2 * factMinus);

		return nCr;
	}
}