package commonCodingPkg;

public class MaximumSumForKsizeWindow_fromStartAndEnd_ {

	
	
	public static int findMaxSumInKwindow_startAndEnd(int[] arr, int k) {

		int sum = 0, tempsum = 0;

		if (arr.length == 0 || k == 0) {
			return -1;
		}
		
		for (int i = 0; i < k; i++) {
			tempsum += arr[i];
		}
		int j = arr.length-1, i = k-1;
		while (j > arr.length-k-1 && i>=0) {
			tempsum = tempsum + arr[j] - arr[i];
			sum = Math.max(sum, tempsum);
			i--;
			j--;
		}
		return Math.max(sum, tempsum);
	}

	public static void main(String args[]) throws Exception {

		int [] arr=new int[]{1,13,2,1,8,5, 5, 2, 3, 11, 9, 1};
		System.out.println(findMaxSumInKwindow_startAndEnd(arr, 3));
	}
}
