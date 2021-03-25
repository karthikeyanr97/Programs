import java.util.Scanner;

public class IDValidation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the location ID is in the format CTS-LLL-XXXX:");
		String locId = scanner.next();

		System.out.println("Enter the location:");
		String location = scanner.next();

		String result = validateIDLocations(locId, location);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String validateIDLocations(String locId, String location) {

		if (locId.length() != 12)
			return "Invalid id";

		int locCount = 0;

		for (int i = 0; i < locId.length(); i++) {

			char id = locId.charAt(i);

			if (i < 4 || i > 6) {

				if (!(id == 'C' || id == 'T' || id == 'S') && (i < 3))
					if (!(id == '-' && (i == 3 || i == 7)))
						if (!(id >= '0' && id <= '9' && i >= 8 && i < 12))
							return "Invalid id";

			} else if (i > 3 && i <= 6) {

				if (!(id == location.charAt(locCount)))
					return "Invalid id";

				locCount++;

			}
		}
		return "Valid id";
	}
}