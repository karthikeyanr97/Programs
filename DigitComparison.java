import java.util.Scanner;

public class DigitComparison extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two numbers:");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();

		boolean result = compareLastDigit(number1, number2);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean compareLastDigit(int number1, int number2) {

		if (number1 % 10 == number2 % 10)
			return true;
		else
			return false;

	}
}