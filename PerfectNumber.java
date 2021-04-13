import java.util.Scanner;

public class PerfectNumber extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the non-negative integer:");
		int number = scanner.nextInt();

		boolean result = getPerfection(number);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean getPerfection(int number) {

		int sum = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0)
				sum += i;

		}
		if (number == sum)
			return true;
		else
			return false;
	}
}