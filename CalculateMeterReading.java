import java.util.Scanner;

public class CalculateMeterReading extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the previous meter reading:");
		String previousReading = scanner.next();
		System.out.println("Enter the current meter reading:");
		String currentReading = scanner.next();

		int result = calculateMeterReading(previousReading, currentReading);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int calculateMeterReading(String previousReading, String currentReading) {

		int preMeterReading = Integer.parseInt(previousReading.substring(6));
		int curMeterReading = Integer.parseInt(currentReading.substring(6));

		return (curMeterReading - preMeterReading) * 4;

	}
}
