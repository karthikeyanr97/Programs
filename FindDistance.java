import java.util.Scanner;

public class FindDistance extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the four number:");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();

		int result = findDistance(x1, x2, y1, y2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int findDistance(int x1, int x2, int y1, int y2) {

		double number = ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double squareroot = number / 2;
		double temp = 0;

		do {

			temp = squareroot;
			squareroot = (temp + (number / temp)) / 2;

		} while ((temp - squareroot) != 0);

		return (int)squareroot;
	}
}