import java.util.Scanner;

public class InitialFormat extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the person's name in the format \"FirstName LastName\":");
		String name = scanner.nextLine();

		String formattedName = nameFormatter(name);
		System.out.println(formattedName);

		scanner.close();
	}
}

class UserMainCode {

	public static String nameFormatter(String name) {

		String FLname[] = name.split(" ");
		return FLname[1] + ", " + FLname[0].charAt(0);

	}
}
