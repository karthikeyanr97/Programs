import java.util.ArrayList;
import java.util.Scanner;

public class Remove3Multiples extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the " + size + " elements:");
		for (int i = 0; i < size; i++)
			list.add(scanner.nextInt());

		ArrayList<Integer> result = removeMultiplesOfThree(list);
		for (Integer integer : result)
			System.out.println(integer);

		scanner.close();
	}
}

class UserMainCode {

	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> list) {

		int size = list.size();
		int removeEle = 0;

		for (int i = 0, count = 1; i < size; i++, count++) {
			if (count % 3 == 0) {
				list.remove(i - removeEle);
				removeEle++;
			}
		}

		return list;
	}
}
