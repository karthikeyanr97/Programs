import java.util.Scanner;

public class MathCalculator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two integer number:");
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();

		System.out.println("Enter the operator:");
		char operator = scanner.next().charAt(0);

		int result = calculator(operand1, operand2, operator);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static int calculator(int operand1, int operand2, char operator) {

		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		case '%':
			return operand1 % operand2;
		}
		return -1;
	}
}