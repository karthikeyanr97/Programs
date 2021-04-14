import java.util.Scanner;

public class SumOfMaxMin extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the three integer numbers:");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		int result = getSumMaxMin(number1, number2, number3);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getSumMaxMin(int number1, int number2, int number3) {

		int sum;

		if (number1 > number2 && number1 > number3) {

			if (number2 > number3)
				sum = number1 + number3;
			else
				sum = number1 + number2;

		} else if (number2 > number3) {

			if (number1 > number3)
				sum = number2 + number3;
			else
				sum = number2 + number1;
		} else {

			if (number1 > number2)
				sum = number3 + number2;
			else
				sum = number3 + number1;

		}
		return sum;
	}
}