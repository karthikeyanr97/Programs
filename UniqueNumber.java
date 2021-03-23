import java.util.Scanner;

public class UniqueNumber extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the non-negative integer:");
		int number = scanner.nextInt();

		int result = getUnique(number);
		if (result == 1)
			System.out.println("Unique");
		else
			System.out.println("Not Unique");

		scanner.close();
	}
}

class UserMainCode {

	public static int getUnique(int number) {

		String num = Integer.toString(number);

		for (int i = 0; i < num.length(); i++) {

			for (int j = i + 1; j < num.length(); j++) {

				if (num.charAt(i) == num.charAt(j))
					return -1;
			}
		}
		return 1;
	}
}
