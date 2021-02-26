package commonCodingPkg;

import java.util.Scanner;

public class NumberOfWaysToClimbStairs {
	public static void main(String[] args) {
		System.out.println("enter number of stairs::");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter max value for each step::");
		int m = sc.nextInt();

		System.out.println(calculateNumberOfWays(n, m));

	}

	private static int calculateNumberOfWays(int n, int m) {
		
		int[] res= new int[n+1];
		
		res[0]=1;
		res[1]=1;
		
		for(int i=2;i<=n;i++) {
			res[i]=0;
			for(int j=1;j<=m && j<=i;j++) 
				res[i]+=res[i-j];
			
		}
		return res[n];
		
	}
}
