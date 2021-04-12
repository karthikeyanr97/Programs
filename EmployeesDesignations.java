import java.util.HashMap;
import java.util.Scanner;

public class EmployeesDesignations extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		HashMap<String, String> empDetails = new HashMap<String, String>();
		System.out.println("Enter the name & designation:");
		for (int i = 0; i < size; i++)
			empDetails.put(scanner.next(), scanner.next());
		
		scanner.next();
		System.out.println("Enter the designation search:");
		String searchDesign = scanner.next();

		String[] names = obtainDesignation(empDetails, searchDesign);
		for (String name : names)
			if (name != null)
				System.out.println(name);

		scanner.close();
	}
}

class UserMainCode {

	public static String[] obtainDesignation(HashMap<String, String> empDetails, String searchDesign) {

		String[] names = new String[empDetails.size()];
		int i = 0;

		for (String name : empDetails.keySet()) {

			if (empDetails.get(name).equalsIgnoreCase(searchDesign))
				names[i++] = name;

		}
		return names;
	}
}