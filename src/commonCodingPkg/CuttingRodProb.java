package commonCodingPkg;

public class CuttingRodProb {
	public static void main(String[] args) {
		int[] arr = new int[] {1,   5,   8,   9,  10,  17,  17,  20 };
		calculate(arr, arr.length);
	}

	private static int calculate(int[] arr, int n) {
		int[] res=new int[n+1];
		
		res[0]=0;
		for (int i=1;i<=n;i++) {
			res[i]=Integer.MAX_VALUE;
			int maxvalue=0;
			System.out.println("here:::"+i);
			for(int j=0;j<i;j++) {
				maxvalue=Math.max(maxvalue, arr[j]+res[i-j-1]);
				System.out.println(j+" ::"+maxvalue);

			}
			System.out.println(maxvalue);

			res[i]=maxvalue;
		}

		System.out.println(res[n]);
		return res[n];
	}

}
