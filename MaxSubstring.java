import java.util.Scanner;

public class MaxSubstring extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the various locations:");
		String locations = scanner.nextLine();

		System.out.println("Enter the delimiter:");
		char delimiter = scanner.next().charAt(0);

		String result = extractMax(locations, delimiter);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String extractMax(String locations, char delimiter) {

		String location[] = locations.split("" + delimiter);
		int largeLocLength = location[0].length();
		String result = location[0];

		for (int i = 0; i < location.length - 1; i++) {

			if (largeLocLength < location[i + 1].length()) {
				largeLocLength = location[i + 1].length();
				result = location[i + 1];
			}
		}
		return result;
	}
}