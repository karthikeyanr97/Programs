import java.util.Scanner;

public class StringFinder extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the searchString:");
		String searchString = scanner.nextLine();

		System.out.println("Enter the string1:");
		String string1 = scanner.nextLine();

		System.out.println("Enter the string2:");
		String string2 = scanner.nextLine();

		int result = stringFinder(searchString, string1, string2);
		if (result == 1)
			System.out.println("yes");
		else
			System.out.println("no");

		scanner.close();
	}
}

class UserMainCode {

	public static int stringFinder(String searchString, String string1, String string2) {

		int indexOfStr1 = searchString.indexOf(string1);
		int indexOfStr2 = searchString.indexOf(string2);

		return indexOfStr1 < indexOfStr2 ? 1 : 2;
	}
}