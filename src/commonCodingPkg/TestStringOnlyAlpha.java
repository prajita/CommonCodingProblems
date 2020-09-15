package commonCodingPkg;

import java.util.Scanner;

public class TestStringOnlyAlpha {
	public static boolean test(String str) {
	return (!str.equals("")&& !str.equals(null)&& str.chars().allMatch(Character::isLetter));
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		System.out.println(test(str));
	}
}
