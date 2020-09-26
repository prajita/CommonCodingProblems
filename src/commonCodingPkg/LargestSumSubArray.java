package commonCodingPkg;

import java.util.Scanner;

public class LargestSumSubArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of inputs:: ");
		int n = sc.nextInt();
		System.out.println("enter numbers:: ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = findLargestSum(arr, n);
		System.out.println("largest sum::" + sum);
	}

	private static int findLargestSum(int[] arr, int length) {
		int max = arr[0], max_current = arr[0];
		for (int i = 1; i < length; i++) {
			max_current = Math.max(arr[i] + max_current, arr[i]);
			System.out.println("current max:"+max_current);
			if (max < max_current) {
				max = max_current;
			}
		}
		return max;
	}
}
