package commonCodingPkg;


/*
 * 
 * diagonal make them 1 for lenth 1
 * 
 * for each length starting from 2 to string length
 * take variable starting as i and ending as j
 * compare to calculate dp matrix 
 * 
 */
public class LongestpalindromeSubsequence {
	public static void main(String args[]) {
		String string="ABABCBAB";
		int res = findlongestpalindromeSubseq(string);
		System.out.println(res);
	}

	private static int findlongestpalindromeSubseq(String string) {

	
		int n=string.length();
		int[][] dp=new int[n][n];
		for(int i=0;i<n;i++) {
			dp[i][i]=1;
		}
		for(int l=2;l<=n;l++) {
			
			for(int i=0;i<=n-l;i++) {
				int j=i+l-1;
				if(string.charAt(i)==string.charAt(j)) {
					dp[i][j]=dp[i+1][j-1]+2;
				}else {
					dp[i][j]=Math.max(dp[i+1][j], dp[i][j-1]);
				}
			}
		}
		return dp[0][n-1];
	}
}
