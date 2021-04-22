import java.util.Scanner;

public class KaprekarNumber extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int result = getKaprekarNumber(number);
		System.out.println(result == 1 ? "Kaprekar Number" : "Not A Kaprekar Number");

		scanner.close();
	}
}

class UserMainCode {

	public static int getKaprekarNumber(int number) {

		int sqrt = number * number;

		String num = String.valueOf(sqrt);

		int leftNum = Integer.parseInt(num.substring(0, num.length() / 2));
		int rightNum = Integer.parseInt(num.substring(num.length() / 2, num.length()));

		int sum = leftNum + rightNum;

		return sum == number ? 1 : -1;
	}
}