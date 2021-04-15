import java.util.Scanner;

public class ValidateNumber extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the -ve number:");
		String negNumber = scanner.next();

		String posNumber = validateNumber(negNumber);
		System.out.println(posNumber);

		scanner.close();
	}
}

class UserMainCode {

	public static String validateNumber(String negNumber) {

		String posNumber = "";

		for (int i = 0; i < negNumber.length(); i++) {

			if (negNumber.charAt(i) != '-')
				if (negNumber.charAt(i) >= '0' && negNumber.charAt(i) <= '9')
					posNumber += negNumber.charAt(i);
				else
					return "-1";
		}
		return posNumber;
	}
}