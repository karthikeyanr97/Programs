import java.util.Scanner;

public class OddDigitSum extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of string:");
		int size = scanner.nextInt();

		String[] stringArray = new String[size];
		System.out.println("Enter the " + size + " String");
		for (int i = 0; i < size; i++)
			stringArray[i] = scanner.next();

		int result = oddDigitSum(stringArray);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int oddDigitSum(String[] stringArray) {

		if(stringArray.length>20) {
			
			System.out.println("Array length reached max of 20");
			return -1;
			
		}
		
		int sum = 0;

		for (int i = 0; i < stringArray.length; i++) {

			for (int j = 0; j < stringArray[i].length(); j++) {

				if (stringArray[i].charAt(j) >= '0' && stringArray[i].charAt(j) <= '9') {

					int number = Integer.parseInt(String.valueOf(stringArray[i].charAt(j)));
					if (number % 2 != 0)
						sum += number;

				}
			}
		}
		return sum;
	}
}