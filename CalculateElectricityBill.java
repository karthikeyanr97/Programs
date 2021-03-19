import java.util.Scanner;

public class CalculateElectricityBill extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the previous reading:");
		String previousReading = scanner.next();
		System.out.println("Enter the current reading:");
		String currentReading = scanner.next();
		System.out.println("Enter the per unit charge:");
		int unitCharge = scanner.nextInt();

		int result = calculateElectricityBill(previousReading, currentReading, unitCharge);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int calculateElectricityBill(String previousReading, String currentReading, int unitCharge) {

		int preReading = Integer.parseInt(previousReading.substring(5));
		int curReading = Integer.parseInt(currentReading.substring(5));
		
		return (curReading - preReading) * unitCharge;

	}
}