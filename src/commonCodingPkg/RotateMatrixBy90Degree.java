package commonCodingPkg;

import java.util.stream.IntStream;

public class RotateMatrixBy90Degree {
	public static void main(String[] args) {
		int matrix[][] = new int[][]{{2, 7, 6, 1},{ 3, 4, 0, 6},{4,  11, 7, 1 }, {5, 8, 3, 1}};
		print(matrix);
		System.out.println();
		transpose(matrix);
		print(matrix);
		System.out.println();
		rotate(matrix);
		print(matrix);
	}

	private static void print(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+"     ");
			}
			System.out.println();
		}	
	}

	private static void transpose(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[0].length;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}

	private static void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			calculaterotate(matrix[i]);
		}
	}

	private static void calculaterotate(int[] arr) {
		int start=0, end=arr.length-1;
		while(start<arr.length/2) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
