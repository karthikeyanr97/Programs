import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToStringArray extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < size; i++)
			list.add(scanner.next());

		String[] result = convertToStringArray(list);
		for (String character : result)
			System.out.println(character);

		scanner.close();
	}
}

class UserMainCode {

	public static String[] convertToStringArray(ArrayList<String> list) {

		String[] strArray = new String[list.size()];

		for (int i = 0; i < list.size(); i++)
			strArray[i] = list.get(i);

		for (int i = 0; i < strArray.length; i++) {

			for (int j = 0; j < strArray.length - 1; j++) {

				char c1 = strArray[j].charAt(0);
				char c2 = strArray[j + 1].charAt(0);

				if (c1 > c2) {

					String swap = strArray[j];
					strArray[j] = strArray[j + 1];
					strArray[j + 1] = swap;

				}
			}
		}
		return strArray;
	}
}
