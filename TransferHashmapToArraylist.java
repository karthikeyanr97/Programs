import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TransferHashmapToArraylist extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the employee:");
		int size = scanner.nextInt();

		HashMap<Integer, String> empDetails = new HashMap<Integer, String>();
		System.out.println("Enter the employee id as key and name as value:");
		for (int i = 0; i < size; i++)
			empDetails.put(scanner.nextInt(), scanner.next());

		String[] empNameArray = getName(empDetails);
		for (String empName : empNameArray) {
			if (empName != null)
				System.out.println(empName);
		}

		scanner.close();
	}
}

class UserMainCode {

	public static String[] getName(HashMap<Integer, String> empDetails) {

		Set<Entry<Integer, String>> setEmpDetail = empDetails.entrySet();
		Iterator<Entry<Integer, String>> iterator = setEmpDetail.iterator();

		String[] nameArray = new String[setEmpDetail.size()];
		int count = 0;

		while (iterator.hasNext()) {

			Entry<Integer, String> entryEmpDetail = (Entry<Integer, String>) iterator.next();

			String empName = entryEmpDetail.getValue();

			if (empName.charAt(0) >= 'a' && empName.charAt(0) <= 'z' && empName.charAt(empName.length() - 1) >= 'A' && empName.charAt(empName.length() - 1) <= 'Z') {

				for (int i = 1; i < empName.length() - 1; i++) {

					if (empName.charAt(i) >= '0' && empName.charAt(i) <= '9') {
						nameArray[count++] = empName;
						break;
					}

				}
			}
		}
		return nameArray;
	}
}