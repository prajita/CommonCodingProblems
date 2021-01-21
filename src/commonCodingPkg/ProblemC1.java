package commonCodingPkg;

import java.util.Scanner;

public class ProblemC1 {
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
		
		if(m[1][1]==1 && m[0][1]==1 && m[2][1]==1 && m[1][0]==1 && m[1][2]==1 && m[0][0]==0 && m[0][2]==0 && m[2][0]==0 && m[2][2]==0 ) {
			return 1;
		}
		if(m[1][1]==1 && m[0][0]==1 && m[0][2]==1 && m[2][0]==1 && m[2][2]==1 ) {
			return 5;
		}

		count += checkForRes(m, 1, 0, 1,0);
		count += checkForRes(m, 0, 2, 2,0);
		count += checkForRes(m, 2, 2, 3,0);
		

		return count;
	}

	private static int checkForRes(int[][] m, int row, int col, int test, int count) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3) {
			return 0;
		}
		if (m[row][col] == 1) {
			count = 1;
			m[row][col] = 0;
		}
		
		if (test == 0 && m[row][col] == 1) {
			count = 1;
		}
		if (test == 1) {
			count=checkForRes(m, row + 1, col, 0,count);
			count=checkForRes(m, row - 1, col, 0,count);
			count=checkForRes(m, row, col + 1, 0,count);
		}
		if (test == 2) {
			count=checkForRes(m, row, col - 1, 0,count);
			count=checkForRes(m, row + 1, col, 0,count);
		}

		if (test == 3) {
			count=checkForRes(m, row, col - 1, 0,count);
		}

		return Math.max(count, 0);
	}

//	private static void printMatrix(int[][] m) {
//		for (int row = 0; row < 3; row++) {
//			for (int col = 0; col < 3; col++) {
//				System.out.print(m[row][col] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//	}
}
