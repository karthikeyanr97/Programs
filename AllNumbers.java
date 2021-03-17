import java.util.Scanner;

public class AllNumbers extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of Strings:");
		int size = scanner.nextInt();

		System.out.println("Enter the String:");
		String stringArray[] = new String[size];
		for (int i = 0; i < size; i++)
			stringArray[i] = scanner.next();

		int result = validateNumber(stringArray);
		if(result==1)
			System.out.println("valid");
		else
			System.out.println("invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validateNumber(String stringArray[]) {

		for (int i = 0; i < stringArray.length; i++) {

			if (stringArray[i].charAt(0) >= '0' && stringArray[i].charAt(0) <= '9') {
				
				int j = 1;
				while(j<stringArray[i].length()) {
					
					if (!(stringArray[i].charAt(j) >= '0' && stringArray[i].charAt(j) <= '9'))
						if(!(stringArray[i].charAt(j)=='.' && stringArray[i].charAt(j-1)>='0' && stringArray[i].charAt(j-1) <= '9'&& j<stringArray[i].length()-1 && stringArray[i].charAt(j+1)>='0' && stringArray[i].charAt(j+1) <= '9'))
							return -1;
					j++;
				}
				
			}else
				return -1;
		}
		return 1;
	}
}