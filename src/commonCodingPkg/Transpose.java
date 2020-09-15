package commonCodingPkg;

public class Transpose {
	public static void print(int[][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void transpose(int[][] m) {
		int R=m.length;
		int C=m[0].length;
		int b[][]=new int[C][R];
		for(int i=0;i<C;i++) {			
			for(int j=0;j<R;j++) {
				b[i][j]=m[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int[][] m= {{1,3,4},{4,6,7},{6,9,5},{5,6,7}};
		print(m);
		transpose(m);
	}
}
