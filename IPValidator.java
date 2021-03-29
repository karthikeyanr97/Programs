import java.util.Scanner;

public class IPValidator extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the IP address:");
		String ipAdd = scanner.next();

		int result = ipValidator(ipAdd);
		if (result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int ipValidator(String ipAdd) {

		int i = 0;
		int count = 0;

		do {

			String splitIpAdd = "";

			while (i < ipAdd.length() && ipAdd.charAt(i) != '.')
				splitIpAdd += ipAdd.charAt(i++);

			if (!(Integer.parseInt(splitIpAdd) <= 255))
				return 2;

			i++;
			count++;

		} while (i < ipAdd.length());

		if (count == 4)
			return 1;
		else
			return 2;
	}
}