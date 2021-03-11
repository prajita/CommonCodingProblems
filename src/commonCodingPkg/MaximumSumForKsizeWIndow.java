package commonCodingPkg;

public class MaximumSumForKsizeWIndow {

	public static int findMaxSumInKwindow(int[] arr, int k) {

		int sum = 0, tempsum = 0;

		if (arr.length == 0 || k == 0) {
			return -1;
		}
		if (k > arr.length) {
			for (int i = 0; i < arr.length; i++) {
				tempsum += arr[i];
			}
			return tempsum;
		}
		for (int i = 0; i < k; i++) {
			tempsum += arr[i];
		}
		int j = k, i = 0;
		while (j < arr.length) {
			tempsum = tempsum + arr[j] - arr[i];
			sum = Math.max(sum, tempsum);
			i++;
			j++;
		}
		return Math.max(sum, tempsum);
	}

	public static void main(String args[]) throws Exception {

		// int [] arr=new int[]{1,13,2,1,8,5, 5, 2, 3, 11, 9};
		int[] arr = new int[] { 1, 13 };
		System.out.println(findMaxSumInKwindow(arr, 3));
	}
}
