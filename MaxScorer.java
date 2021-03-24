import java.util.Scanner;

public class MaxScorer extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int size = scanner.nextInt();

		String[] stuInfo = new String[size];
		System.out.println("Enter the student information like name and obtained marks of three subjects Eg: name-mark1-mark2-mark3 [suresh-70-47-12] :");
		for (int i = 0; i < size; i++)
			stuInfo[i] = scanner.next();

		String name = highestScorer(stuInfo);
		System.out.println(name);

		scanner.close();
	}
}

class UserMainCode {

	public static String highestScorer(String[] stuInfo) {

		int maxMark = 0;
		String maxMarkStud = "";

		for (int i = 0; i < stuInfo.length; i++) {

			String[] studDetail = stuInfo[i].split("-");
			String studName = studDetail[0];
			int sum = 0;

			for (int j = 1; j < studDetail.length; j++)
				sum += Integer.parseInt(studDetail[j]);

			if (i == 0) {

				maxMark = sum;
				maxMarkStud = studName;

			} else if (i != 0) {

				if (sum > maxMark) {
					maxMark = sum;
					maxMarkStud = studName;
				}
			}
		}
		return maxMarkStud;
	}
}