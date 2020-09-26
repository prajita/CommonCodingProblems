package commonCodingPkg;

public class Fibonacci {
	public static int callFiboBottomUp(int n) {
		int[] f = new int[n+2];
		f[0]=0;
		f[1]=1;
		for (int i = 2; i <=n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			
		}
		return f[n];
	}
	public static int callFiboTopDown(int n) {
		int[] f = new int[n+2];
		if( n==1) return 1;
		if( n==0) return 0;
		if(f[n]!=0) return f[n];
		return f[n]=callFiboTopDown(n-1)+callFiboTopDown(n-2);
	}
	
	public static int callFiboOptimized(int n) {
		int a=0, b=1, sum=0;
		for(int i=0;i<n-1;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}

	

	public static void main(String args[]) {
		int n = 15;
		//System.out.println(callFiboBottomUp(n));
		System.out.println(callFiboTopDown(n));
		
		System.out.println(callFiboOptimized(n));


	}
}
