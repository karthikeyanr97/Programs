import java.util.Scanner;

public class ExperienceCalculator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the joining date:");
		String joinDate = scanner.next();

		System.out.println("Enter the current date:");
		String currDate = scanner.next();

		System.out.println("Enter the year in experience:");
		int exp = scanner.nextInt();

		boolean result = calculateExperience(joinDate, currDate, exp);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static boolean calculateExperience(String joinDate, String currDate, int exp) {

		int locExp = 0;

		int joinYr = Integer.parseInt(joinDate.substring(6, 10));
		int joinMon = Integer.parseInt(joinDate.substring(3, 5));
		int joinDay = Integer.parseInt(joinDate.substring(0, 2));

		int currYr = Integer.parseInt(currDate.substring(6, 10));
		int currMon = Integer.parseInt(currDate.substring(3, 5));
		int currDay = Integer.parseInt(currDate.substring(0, 2));

		if (currYr > joinYr)
			locExp = currYr - joinYr;

		if (joinMon > currMon)
			locExp -= 1;
		else if (joinMon == currMon)
			if (joinDay > currDay)
				locExp -= 1;

		return locExp == exp;
	}
}