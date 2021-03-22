import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Retirement extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of emplyoees:");
		int size = scanner.nextInt();

		HashMap<String, String> empDetails = new HashMap<String, String>();
		System.out.println("Enter the employee ID & DOB (date is in dd/MM/yyyy format):");
		for (int i = 0; i < size; i++)
			empDetails.put(scanner.next(), scanner.next());

		String currentDate = "01/01/2014";

		ArrayList<String> retireId = retirementEmployeeList(empDetails, currentDate);
		System.out.println(retireId);

		scanner.close();
	}
}

class UserMainCode {

	public static ArrayList<String> retirementEmployeeList(HashMap<String, String> empDetails, String currentDate) {

		ArrayList<String> retireId = new ArrayList<String>();

		int currentDay = Integer.parseInt(currentDate.substring(0, 2));
		int currentMon = Integer.parseInt(currentDate.substring(3, 5));
		int currentYr = Integer.parseInt(currentDate.substring(6));

		Set<Entry<String, String>> empIdDate = empDetails.entrySet();

		for (Entry<String, String> empDetail : empIdDate) {

			String id = empDetail.getKey();
			int day = Integer.parseInt(empDetail.getValue().substring(0, 2));
			int mon = Integer.parseInt(empDetail.getValue().substring(3, 5));
			int year = Integer.parseInt(empDetail.getValue().substring(6));

			if ((currentYr - year) > 60)
				retireId.add(id);
			else if ((currentYr - year) == 60) {

				if (currentMon > mon)
					retireId.add(id);

				else if (currentMon == mon) {

					if (currentDay > day)
						retireId.add(id);
					else if (currentDay == day)
						retireId.add(id);

				}

			}

		}
		return retireId;
	}
}
