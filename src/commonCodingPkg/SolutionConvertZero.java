package commonCodingPkg;

import java.util.Scanner;

public class SolutionConvertZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:: ");
		System.out.println(convertToZero(sc.nextLine()));
	}
	private static int convertToZero(String p) {
		String bin = p;
		int count = 0;
		// loop until String contains only zeroes
		//while (!bin.matches("^[0]+$")) {
		while (bin.contains("1")) {
			char end = bin.charAt(bin.length() - 1);
			if (end == '0') {
				bin = bin.substring(0, bin.length() - 1);
			} else {
				bin = bin.substring(0, bin.length() - 1) + "0";
				
			}
			count++;
		}
		return count;
	}
}