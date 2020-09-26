package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;

public class SubArraysWithKDifferentIntegers {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 1, 3, 9, 6, 2, 3 };
		getAllSubArraysWithSizeK(arr, 3);
	}

	private static void getAllSubArraysWithSizeK(int[] arr, int k) {
		int count = printSubArrays(arr, 0, 0, 0, k);
		System.out.println("final_count:: " + count);
	}

	private static int printSubArrays(int[] arr, int start, int end, int count, int k) {
		if (end == arr.length)
			return count;

		if (start > end) {
			count = printSubArrays(arr, 0, end + 1, count, k);
		} else {
			Set<Integer> set = new HashSet<Integer>();
			for (int i = start; i <= end; i++) {
				set.add(arr[i]);
			}

			if (set.size() == k) {
				for (int i = start; i <= end; i++) {
					System.out.print(arr[i] + "   ");
				}
				count++;
				System.out.println();
			}
			
			count = printSubArrays(arr, start + 1, end, count, k);
		}
		return count;
	}
}
