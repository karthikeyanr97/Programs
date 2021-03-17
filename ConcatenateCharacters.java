import java.util.Scanner;

public class ConcatenateCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int size = scanner.nextInt();

		String stringArray[] = new String[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++)
			stringArray[i] = scanner.next();

		String result = concatCharacter(stringArray);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String concatCharacter(String[] stringArray) {

		String result = "";

		for (int i = 0; i < stringArray.length; i++) {
			result += stringArray[i].charAt(stringArray[i].length() - 1);
		}
		return result;
	}
}