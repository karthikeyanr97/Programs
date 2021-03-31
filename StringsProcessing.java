import java.util.Scanner;

public class StringsProcessing extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the fruits seperate by '/':");
		String fruits = scanner.nextLine();

		System.out.println("Enter the position:");
		int pos = scanner.nextInt();

		String result = findFruitName(fruits, pos);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String findFruitName(String fruits, int pos) {

		String[] fruit = fruits.split(",");

		if (fruit.length <= pos)
			return fruit[fruit.length - 1];
		else
			return fruit[pos - 1];
	}
}