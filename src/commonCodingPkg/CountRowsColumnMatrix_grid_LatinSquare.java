package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;


//Vestigium (7pts)

//latin matrix

public class CountRowsColumnMatrix_grid_LatinSquare {
	public static void main(String args[]) {
		int[][] matrix = new int[][] { {1, 2, 3, 4}, {2, 1, 4, 3}, { 3, 4, 1, 2 }, {4, 3, 2, 1}};
		boolean res = checkLatinMatrix(matrix);
		System.out.print(res);

	}

	private static boolean checkLatinMatrix(int[][] matrix) {

		int len = matrix.length;

		int rows = 0;
		int cols = 0;
		boolean res = true;

		for (int i = 0; i < len; i++) {

			Set<Integer> set = new HashSet<Integer>();
			
			int[] temp=matrix[i];
			
			for(int e: temp) {
				set.add(e);
			}
			
			if(len!=set.size()) {
				rows++;
			}
		}

		
		for (int i = 0; i < len; i++) {
			int count=0;
			int[] arr=new int[len];
			for(int j=0;j<len;j++) {	
				arr[count++]=matrix[j][i];
			}
			Set<Integer> set = new HashSet<Integer>();
			
			
			for(int e: arr) {
				set.add(e);
			}
			
			if(len!=set.size()) {
				cols++;
			}			
		}

		System.out.println("rows" + rows);
		System.out.println("cols" + cols);
		return res;
	}

}
