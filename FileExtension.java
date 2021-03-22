import java.util.Scanner;

public class FileExtension extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the file extension:");
		String fileNameExtn = scanner.nextLine();

		String fileExtn = fileIdentifier(fileNameExtn);
		System.out.println(fileExtn);

		scanner.close();
	}
}

class UserMainCode {

	public static String fileIdentifier(String fileNameExtn) {

		String fileExtn = "";

		for (int i = fileNameExtn.length() - 1; i >= 0; i--) {

			if (fileNameExtn.charAt(i) == '.')
				break;
			else
				fileExtn = fileNameExtn.charAt(i) + fileExtn;
		}
		return fileExtn;
	}
}
