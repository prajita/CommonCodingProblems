package commonCodingPkg;

public class MinimumJumps2ReachEnd {
	public static int calculateMinJump(int[] arr,int n) {
		int[] jumps= new int[n];
		jumps[0]=0;
		for(int i=1;i<n;i++) {
			jumps[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++) {
				if(i-j<=arr[j] && jumps[j]!=Integer.MAX_VALUE ) {
					jumps[i]=Math.min(jumps[j]+1, jumps[i]);
				}
			}			
		}
		
		return jumps[n-1];
	}
	public static void main(String[] args) {
		int [] arr= {1,2,4,1,0,3,6,3,7};
		System.out.println(calculateMinJump(arr,arr.length));
	}
}
