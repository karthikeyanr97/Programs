import java.util.Scanner;

public class RemoveElements extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size = scanner.nextInt();

		String[] stringArray = new String[size];
		System.out.println("Enter the " + size + " Strings:");
		for (int i = 0; i < size; i++)
			stringArray[i] = scanner.next();

		System.out.println("Enter which length of the string to be remove:");
		int removeLen = scanner.nextInt();

		int result = removeElements(stringArray, removeLen);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int removeElements(String[] stringArray, int removeLen) {

		if (stringArray.length > 20) {
			System.out.println("Maximum length of array is 20");
			return 0;
		}

		int removeEleSize = 0;

		for (int i = 0; i < stringArray.length; i++) {

			if (stringArray[i].length() == removeLen) {
				stringArray[i] = null;
				removeEleSize++;
			}

		}
		return stringArray.length - removeEleSize;
	}
}