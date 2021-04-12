import java.util.Scanner;

public class ArrayListStringArray extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int sizem = scanner.nextInt();

		String[] fruitm = new String[sizem];
		System.out.println("Enter the " + sizem + " fruits:");
		for (int i = 0; i < sizem; i++)
			fruitm[i] = scanner.next();

		System.out.println("Enter the size:");
		int sizen = scanner.nextInt();

		String[] fruitn = new String[sizen];
		System.out.println("Enter the " + sizen + " fruits:");
		for (int i = 0; i < sizen; i++)
			fruitn[i] = scanner.next();

		String[] fruit = fruitSelector(fruitm, fruitn);
		for (String fruitName : fruit)
			if (fruitName != null)
				System.out.println(fruitName);

		scanner.close();
	}
}

class UserMainCode {

	public static String[] fruitSelector(String[] fruitm, String[] fruitn) {

		String[] fruit = new String[fruitm.length + fruitn.length];

		for (int i = 0; i < fruitm.length || i < fruitn.length; i++) {

			if (i < fruitm.length) {

				if (fruitm[i].charAt(fruitm[i].length() - 1) != 'a' && fruitm[i].charAt(fruitm[i].length() - 1) != 'e')
					fruit[i] = fruitm[i];
			}

			if (i < fruitn.length) {

				if (fruitn[i].charAt(0) != 'A' && fruitn[i].charAt(0) != 'M')
					fruit[i] = fruitn[i];

			}
		}
		return fruit;
	}
}