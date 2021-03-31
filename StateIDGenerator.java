import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StateIDGenerator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of location:");
		int size = scanner.nextInt();

		String[] location = new String[size];
		System.out.println("Enter the " + size + " location");
		for (int i = 0; i < size; i++)
			location[i] = scanner.next();

		HashMap<String, String> locIdMap = getStateId(location);
		for (Entry<String, String> entryLocIdMap : locIdMap.entrySet())
			System.out.println(entryLocIdMap.getValue() + ":" + entryLocIdMap.getKey());

		scanner.close();
	}
}

class UserMainCode {

	public static HashMap<String, String> getStateId(String[] location) {

		HashMap<String, String> locIdMap = new HashMap<String, String>();

		for (int i = 0; i < location.length; i++) {

			String locId = location[i].substring(0, 3).toUpperCase();
			locIdMap.put(location[i], locId);

		}
		return locIdMap;
	}
}