import java.util.Scanner;

public class DOBValidation extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date format (MM/dd/yyyy):");
		String dob = scanner.next();

		boolean result = ValidateDOB(dob);
		System.out.println(String.valueOf(result).toUpperCase());

		scanner.close();
	}
}

class UserMainCode {

	public static boolean ValidateDOB(String dob) {
		
		int mon = Integer.parseInt(dob.substring(0, 2));
		int day = Integer.parseInt(dob.substring(3, 5));
		String yr = dob.substring(6, dob.length());
		
		if(yr.length()==4)
			if(day>0 && day<=31)
				if(mon>0 && mon<=12)
					return true;
		
		return false;
	}
}