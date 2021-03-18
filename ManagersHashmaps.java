import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ManagersHashmaps extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of employees:");
		int size = scanner.nextInt();

		HashMap<Integer, String> designHashmap = new HashMap<Integer, String>();
		HashMap<Integer, Integer> salarayHashmap = new HashMap<Integer, Integer>();
		System.out.println("Enter the id, designation, salaray:");
		for (int i = 0; i < size; i++) {

			int id = scanner.nextInt();
			designHashmap.put(id, scanner.next());
			salarayHashmap.put(id, scanner.nextInt());

		}

		HashMap<Integer, Integer> result = increaseSalaries(designHashmap, salarayHashmap);
		Set<Entry<Integer, Integer>> increasedSalarayMap = result.entrySet();

		for (Entry<Integer, Integer> hikeEmpDetails : increasedSalarayMap)
			System.out.println(hikeEmpDetails.getKey() + "\n" + hikeEmpDetails.getValue());

		scanner.close();
	}
}

class UserMainCode {

	public static HashMap<Integer, Integer> increaseSalaries(HashMap<Integer, String> designHashmap,
			HashMap<Integer, Integer> salarayHashmap) {

		HashMap<Integer, Integer> increasedSalaray = new HashMap<Integer, Integer>();
		Set<Integer> keySet = designHashmap.keySet();
		int hikeSalary = 5000;

		for (int key : keySet)
			if (designHashmap.get(key).equalsIgnoreCase("manager"))
				increasedSalaray.put(key, salarayHashmap.get(key) + hikeSalary);

		return increasedSalaray;
	}
}