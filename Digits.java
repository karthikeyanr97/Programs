import java.util.Scanner;

public class Digits extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the +ve number:");
		int number = scanner.nextInt();

		int result = countSeven(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int countSeven(int number) {

		int count = 0;

		while (number > 0) {

			if (number % 10 == 7)
				count++;

			number /= 10;
		}
		return count;
	}
}