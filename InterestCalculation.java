import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class InterestCalculation extends UserMainCode117 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of employees:");
		int size = scanner.nextInt();

		HashMap<String, String> idDob = new HashMap<String, String>();
		HashMap<String, Integer> idAmt = new HashMap<String, Integer>();

		System.out.println("Enter the ID, DOB & Amount:");
		for (int i = 0; i < size; i++) {

			String id = scanner.next();
			idDob.put(id, scanner.next());
			idAmt.put(id, scanner.nextInt());
		}

		String roiDate = "01/01/2015";

		TreeMap<String, Integer> result = calculateInterestRate(idDob, idAmt, roiDate);
		for (Entry<String, Integer> entryIdAmt : result.entrySet())
			System.out.println(entryIdAmt.getKey() + ":" + entryIdAmt.getValue());

		scanner.close();
	}
}

class UserMainCode117 {

	public static TreeMap<String, Integer> calculateInterestRate(HashMap<String, String> idDob, HashMap<String, Integer> idAmt, String roiDate) {

		TreeMap<String, Integer> revisedAmt = new TreeMap<String, Integer>();

		int roiMon = Integer.parseInt(roiDate.substring(3, 5));
		int roiDay = Integer.parseInt(roiDate.substring(0, 2));

		for (Entry<String, String> entryIdDob : idDob.entrySet()) {

			String date = entryIdDob.getValue();

			int mon = Integer.parseInt(date.substring(3, 5));
			int day = Integer.parseInt(date.substring(0, 2));

			int age = Integer.parseInt(roiDate.substring(6, 10)) - Integer.parseInt(date.substring(6, 10));

			if (mon > roiMon)
				age -= 1;
			else if (day > roiDay)
				age -= 1;

			double Pamt = idAmt.get(entryIdDob.getKey());
			double roiAmt = age >= 60 ? Pamt * (10.0 / 100.0) : age >= 30 ? Pamt * (7.0 / 100.0) : Pamt * (4.0 / 100.0);

			double reviseAmt = Pamt + roiAmt;

			revisedAmt.put(entryIdDob.getKey(), (int) reviseAmt);
		}
		return revisedAmt;
	}
}