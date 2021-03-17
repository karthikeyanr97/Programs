import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LargestKeyHashMap extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int size = scanner.nextInt();

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		System.out.println("Enter the key as number & value as word pair elements:");
		for (int i = 0; i < size; i++)
			hashMap.put(scanner.nextInt(), scanner.next());

		String result = getMaxKeyValue(hashMap);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getMaxKeyValue(HashMap<Integer, String> hashMap) {

		Set<Integer> keySet = hashMap.keySet();
		int largeKey = 0;

		for (int key : keySet) {
			if (largeKey < key)
				largeKey = key;
		}
		return hashMap.get(largeKey);
	}
}