package starPattern;

import java.util.Scanner;

public class PatternMatrix {
	public static void paintPattern(int a) {
		for (int i = 0; i < 2 * a - 1; i++) {
			for (int j = 0; j < 2 * a - 1; j++) {
				System.out.print(1 + Math.max(Math.abs(a - i - 1), Math.abs(a - j - 1)));
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input number of increasing star value::");
		int n = sc.nextInt();
		paintPattern(n);
	}
}
