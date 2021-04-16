import java.util.Scanner;

public class Scores extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		int[] scores = new int[size];
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < scores.length; i++)
			scores[i] = scanner.nextInt();

		boolean result = checkScores(scores);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean checkScores(int[] scores) {

		for (int i = 0; i < scores.length; i++) {

			if (scores[i] == 100)
				if (i + 1 < scores.length && scores[i + 1] == 100)
					return true;

		}
		return false;
	}
}