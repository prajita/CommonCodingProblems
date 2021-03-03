package commonCodingPkg;
/*
 * 
 * ABCDA diagnal-> make them 1
 * 
 * if 1st and last chars are equal dp[i][j]=dp[i+1][j-1]+2
 * 
 * else dp[i][j]=Math.max(dp[i][j-1]+dp[i+1][j])
 * 
 */
public class LongestPalindromeSubsequence {
	public static void main(String args[]) {
		String s = "BABCBAB";
		System.out.println(callUtil(s));
	}
	private static int callUtil(String s) {		
		int n = s.length();
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}
		for (int l = 2; l <= n; l++) {
			for (int i = 0; i <= n - l ; i++) {
				int j = i + l - 1;
				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;

				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
				}
			}
		}
		return dp[0][n - 1];
	}
}
