package commonCodingPkg;

import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();

		if (checkDeletion(n, str1, str2)) {
			System.out.println("Deletion succeeded");
		} else {
			System.out.println("Deletion failed");
		}
	}

	private static boolean checkDeletion(int n, String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		if (n % 2 == 0) {
			if (str1.equals(str2)) {
				return true;
			}
		} else {
			if (checkIfToggled(str1, str2)) {
				return true;
			}
		}
		return false;

	}

	private static boolean checkIfToggled(String str1, String str2) {
		int len = str1.length();
		if (len != str2.length()) {
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
