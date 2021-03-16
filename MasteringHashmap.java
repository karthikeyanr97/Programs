import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MasteringHashmap extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int size = scanner.nextInt();

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		System.out.println("Enter the key & value pair elements:");
		for (int i = 0; i < size; i++)
			hashMap.put(scanner.nextInt(), scanner.nextInt());

		int result = getAverageOfOdd(hashMap);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getAverageOfOdd(HashMap<Integer, Integer> hashMap) {

		int sum = 0;
		int count = 0;
		Set<Integer> keySet = hashMap.keySet();

		for (int key : keySet) {

			if (key % 2 != 0) {
				sum += hashMap.get(key);
				count++;
			}

		}
		return sum / count;
	}
}