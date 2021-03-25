import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class GradeCalculator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int size = scanner.nextInt();

		HashMap<Integer, Integer> stuDetails = new HashMap<Integer, Integer>();
		System.out.println("Enter the id & marks:");
		for (int i = 0; i < size; i++)
			stuDetails.put(scanner.nextInt(), scanner.nextInt());

		TreeMap<Integer, String> gradeOfStud = calculateGrade(stuDetails);

		Set<Entry<Integer, String>> setStudDetails = gradeOfStud.entrySet();
		for (Entry<Integer, String> studDetail : setStudDetails)
			System.out.println(studDetail.getKey() + "\n" + studDetail.getValue());

		scanner.close();
	}
}

class UserMainCode {

	public static TreeMap<Integer, String> calculateGrade(HashMap<Integer, Integer> stuDetails) {

		TreeMap<Integer, String> gradeOfStud = new TreeMap<Integer, String>();
		Set<Entry<Integer, Integer>> setStuDetails = stuDetails.entrySet();

		for (Entry<Integer, Integer> entryStudDetail : setStuDetails) {

			if (entryStudDetail.getValue() >= 80)
				gradeOfStud.put(entryStudDetail.getKey(), "GOLD");
			else if (entryStudDetail.getValue() >= 60)
				gradeOfStud.put(entryStudDetail.getKey(), "SILVER");
			else if (entryStudDetail.getValue() >= 45)
				gradeOfStud.put(entryStudDetail.getKey(), "BRONZE");
			else
				gradeOfStud.put(entryStudDetail.getKey(), "FAIL");

		}
		return gradeOfStud;
	}
}
