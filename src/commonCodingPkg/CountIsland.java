package commonCodingPkg;

import java.util.Scanner;

public class CountIsland {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int[][] m = new int[3][3];

			for (int j = 0; j < 3; j++) {
				String r = sc.nextLine();
				char[] c = r.toCharArray();
				for (int k = 0; k < 3; k++) {
					int val = (int) c[k];
					if (val == 42) {
						m[j][k] = 1;
					} else {
						m[j][k] = 0;
					}
				}
			}
			arr[i] = countNum(m);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int countNum(int[][] m) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {

				if (m[row][col] == 1) {
					count += checkForRes(m, 0, 0);
				}
			}
		}
		return count;
	}

	private static int checkForRes(int[][] m, int row, int col) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3 ||m[row][col]==0) {
			return 0;
		}

		if(m[row][col]==1) {
			m[row][col]=0;
		}
		checkForRes(m, row + 1, col);
		checkForRes(m, row - 1, col);
		checkForRes(m, row, col + 1);
		checkForRes(m, row, col - 1);

		return 1;
	}

	private static void printMatrix(int[][] m) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
}
