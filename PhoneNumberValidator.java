import java.util.Scanner;

public class PhoneNumberValidator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Phone number:");
		String phoneNumber = scanner.nextLine();

		int result = validatePhoneNumber(phoneNumber);
		if (result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validatePhoneNumber(String phoneNumber) {

		int countDigits = 0;

		for (int i = 0; i < phoneNumber.length(); i++) {

			if (phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')
				countDigits++;
			else if (!(phoneNumber.charAt(i) == '-'))
				return 2;
		}
		return countDigits == 10 ? 1 : 2;
	}
}