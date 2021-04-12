import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



public class CalculateAverage extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
		System.out.println("Enter the key & value pair:");
		for (int i = 0; i < size; i++)
			hashMap.put(scanner.nextInt(), scanner.nextDouble());

		double avg = calculateAverage(hashMap);
		System.out.println(avg);

		scanner.close();
	}
}

class UserMainCode {

	public static double calculateAverage(HashMap<Integer, Double> hashMap) {

		double sum = 0;
		int count = 0;

		Set<Integer> ketSet = hashMap.keySet();

		for (int key : ketSet) {

			if (key % 2 != 0) {
				sum += hashMap.get(key);
				count++;
			}

		}

		String avgStr = String.valueOf(sum / count);
		String avg = "";
		count = 0;
		
		for (int i = 0; i < avgStr.length() && count < 3; i++) {

			if (avgStr.charAt(i) != '.' && count == 0) {

				avg += avgStr.charAt(i);
			} else {

				avg += avgStr.charAt(i);
				count++;
			}
		}
		return Double.parseDouble(avg);
	}
}