package commonCodingPkg;

public class TransposeMatrix {
	public static void main(String[] args) {
		int matrix[][] = new int[][] { { 2, 7, 6, 1 }, { 3, 4, 0, 6 }, { 4, 11, 7, 1 } };
		print(matrix);
		System.out.println();
		transpose(matrix);
		

	}

	private static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "     ");
			}
			System.out.println();
		}
	}

	private static void transpose(int[][] matrix) {
		int[][] b = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {			
			for (int j = 0; j < matrix[0].length; j++) {
				b[j][i] = matrix[i][j];
			}
		}
		print(b);
		System.out.println();
	}

}
