package commonCodingPkg;

public class FindStartEndofTargetInSortedArray {

	public static void main(String... args) {

		int[] input = new int[] { 1, 2, 4, 5, 6, 9, 2};
		int k = 2;

		findStartEndofTarget(input, k);
	}

	private static void findStartEndofTarget(int[] arr, int k) {
		int[] result =new int[2];int count=0;

		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==k && count==0) {
				result[0]=i;
				count++;
			}else if(arr[i]==k && count>=1) {
				result[1]=i;
			}else if(arr[i]!=k && count==1) {
				break;
			}
		}
		if(result[0]!=0 && result[1]==0) {
			result[1]=result[0];
		}
		if(count==0) {
			result[0]=-1;
			result[1]=-1;
		}
		System.out.println(result[0]+"  "+result[1]);
	}
}
