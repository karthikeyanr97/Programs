import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class RemovingElementFromHashMap extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		System.out.println("Enter the " + size + " elements:");
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>(size);
		for (int i = 0; i < size; i++)
			hashmap.put(scanner.nextInt(), scanner.next());

		int result = afterDelete(hashmap);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int afterDelete(HashMap<Integer, String> hashmap) {

		List<Integer> keySet = new ArrayList<Integer>(hashmap.keySet());

		for (int key : keySet) {

			if (key % 3 == 0)
				hashmap.remove(key);

		}
		return hashmap.size();
	}
}