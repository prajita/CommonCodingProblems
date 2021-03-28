package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class FindLargestSquareInMatrix {
	public static void main(String args[]) {
		int[][] m=new int [][]{{0, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 0}};
		int[][] sol= new int[m.length][m[0].length];
		
		callUtil(m, sol);
		
	}

	private static void callUtil(int[][] m, int[][] sol) {

		
		for(int i=0;i<m[0].length;i++) {
			sol[0][i]=m[0][i];
		}
		
		for(int i=0;i<m.length;i++) {
			sol[i][0]=m[i][0];
		}
		
		
		for(int i=1;i<m.length;i++) {
			for(int j=01;j<m[0].length;j++) {
				
				
				if(m[i][j]==1) {
					sol[i][j]=Math.min(sol[i-1][j-1],Math.min(sol[i-1][j],sol[i][j-1]))+1;
				}else {
					sol[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<sol.length;i++) {
			for(int j=0;j<sol[0].length;j++) {
				System.out.print(sol[i][j]);
			}
			System.out.println();
		}
	}
}
