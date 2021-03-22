import java.util.Scanner;

public class DateFormatConversion extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date format dd/mm/yyyy:");
		String date = scanner.nextLine();

		String formatedDate = convertDateFormat(date);
		System.out.println(formatedDate);

		scanner.close();
	}
}

class UserMainCode {

	public static String convertDateFormat(String date) {

		String formatedDate = "";

		for (int i = 0; i < date.length(); i++) {

			if (date.charAt(i) == '/')
				formatedDate += "-";
			else if(i!=6 && i!=7)
				formatedDate += date.charAt(i);

		}
		return formatedDate;
	}
}
