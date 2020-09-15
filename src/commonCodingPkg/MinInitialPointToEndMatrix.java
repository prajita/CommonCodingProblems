package commonCodingPkg;

public class MinInitialPointToEndMatrix {
	public static void calculateInitialPoints(int[][] arr,int R,int C) {
		int m=R,n=C;
		
		int[][] dp=new int[m][n];
		dp[m-1][n-1]=arr[m-1][n-1]>0? 1:Math.abs(arr[m-1][n-1])+1;
		
		for(int i=m-2;i>=0;i--) {
			dp[i][n-1]=Math.max(dp[i+1][n-1]-arr[i][n-1], 1);
		}
		
		for(int i=n-2;i>=0;i--) {
			dp[m-1][i]=Math.max(dp[m-1][i+1]-arr[m-1][i], 1);
		}
		
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				int temp=Math.min(dp[i][j+1],dp[i+1][j]);
				dp[i][j]=Math.max(temp-arr[i][j], 1);
			}
		}
		System.out.println(dp[0][0]);
		
	}
	public static void main(String[] args) {
		int[][] points= {{-2,-3,3},{-5,-10,1},{10,30,-5}};
		calculateInitialPoints(points,3,3);
	}
}
