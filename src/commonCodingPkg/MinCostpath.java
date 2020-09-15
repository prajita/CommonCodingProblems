package commonCodingPkg;

public class MinCostpath {
	
	public static void calulateCost(int[][] cost, int m,int n) {
		
		int [][] temp=new int[m][n];
		temp[0][0]=cost[0][0];
		for(int i=1;i<=(m-1);i++) {
			temp[i][0]= cost[i][0]+temp[i-1][0];
			
		}
		for(int i=1;i<=(n-1);i++) {
			temp[0][i]= cost[0][i]+temp[0][i-1];
		}
		for(int i=1;i<=m-1;i++) {
			for(int j=1;j<=n-1;j++) {
				temp[i][j]=cost[i][j]+min(temp[i-1][j],temp[i][j-1],temp[i-1][j-1]);
				//System.out.println(temp[i][j]);		
			}
		}
		
		System.out.println(temp[m-1][n-1]);		
		
	}
	public static int  min(int a,int b,int c) {
		return Math.min(a, Math.min(c, b));
		
	}
	public static void main(String[] args) {
		int[][] cost= {{1,2,3},{4,8,2},{1,5,3}};
		calulateCost(cost,3,3);
	}
}
