package commonCodingPkg;


public class SpiralMatrix {

	public static void printmatrix(int[][] a, int R, int C) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printSpiral(int[][] a, int R, int C) {
		int i, k = 0, l = 0;
		while (k < R && l < C) {
			for (i = l; i < C; i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			for (i = k; i < R; i++) {
				System.out.print(a[i][C-1]+" ");
			}
			C--;
			if(k<R){
				for (i = C-1; i >= l; i--) {
					System.out.print(a[R-1][i]+" ");
				}
				R--;
			}
			if(l<C){
				for (i = R-1; i >= k; i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
		}
	}

	public static void main(String args[]) {

		int a[][] = { { 1, 2, 3, 4, 5 }, { 7, 2, 4, 5, 5 }, { 8, 4, 7, 3, 9 },
				{ 3, 1, 2, 0, 5 } };
		int R = a.length;
		int C = a[0].length;
		printmatrix(a, R, C);
		System.out.println();
		printSpiral(a, R, C);
	}
}
