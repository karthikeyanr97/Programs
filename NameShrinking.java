import java.util.Scanner;

public class NameShrinking extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first name, middle name, last name:");
		String name = scanner.nextLine();

		String formatName = getFormatedString(name);
		System.out.println(formatName);

		scanner.close();
	}
}

class UserMainCode {

	public static String getFormatedString(String name) {

		String formatName = "";
		String locName = "";
		int count = 0;

		for (int i = name.length() - 1; i >= 0; i--) {

			if (name.charAt(i) != ' ') {

				locName = name.charAt(i) + locName;

			} else {

				if (count == 0)
					formatName += locName;
				else if (count == 1)
					formatName += " " + locName.charAt(0);

				locName = "";
				count++;
			}
		}
		return formatName + "." + locName.charAt(0);
	}
}