package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class FindClosestKElemetsOf_x_InSortedArray {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 4, 6, 8 , 9, 11, 12, 14};
		if (arr.length == 0)
			System.out.println("no elements in the array ");
		System.out.println(findClosest(arr, 13, 4));
	}

	private static List<Integer> findClosest(int[] arr, int target, int k) {

		int nearest = findNearest(arr, target);
		List<Integer> list = new ArrayList<Integer>();
		int low = nearest, high = nearest;
		while (high - low + 1 < k && low >= 0 && high < arr.length - 1) {
			if (Math.abs(arr[low - 1] - target) <= Math.abs(arr[high] - target)) {
				low--;
			} else {
				high++;
			}
		}
		while (high - low + 1 < k && low > 0) {
			low--;
		}
		while (high - low + 1 < k && high < arr.length) {
			high++;
		}
		System.out.println(high + " " + low);
		while (low <=high) {
			list.add(arr[low]);
			low++;
		}

		return list;
	}

	private static int findNearest(int[] arr, int target) {
		int high = arr.length, low = 0, closest = -1, min_diff = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int temp = arr[mid];

			if (Math.abs(target - temp) < min_diff) {
				min_diff = Math.abs(target - temp);
				closest = mid;
			}
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(closest);
		return closest;
	}
}
