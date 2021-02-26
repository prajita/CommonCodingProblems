package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class FindClosest_K_elements {
	public static void main(String args[]) {
		int[] arr = new int[] { -3, 1, 4, 5, 7, 8, 11, 12, 14, 16, 19 };
		int target = 10;
		int num = 5;
		findClosestnumOfEle(arr, target, num);
	}

	private static void findClosestnumOfEle(int[] arr, int target, int num) {

		int nearest = findNearest(arr, target);
		List<Integer> list = new ArrayList<Integer>();
		int left = nearest, right = nearest;
		while (right - left + 1 < num && left >= 0 && right < arr.length - 1) {

			if (Math.abs(arr[left - 1] - target) <= Math.abs(arr[right] - target)) {
				left++;
			}else {
				right++;
			}
		}
		while (right - left + 1 < num && left > 0) {
			left--;
		}
		while (right - left + 1 < num && right < arr.length) {
			right++;
		}
		System.out.println(right + " " + left);
		while (left <=right) {
			list.add(arr[left]);
			left++;
		}

	}

	private static int findNearest(int[] arr, int target) {
		int min_diff = Integer.MAX_VALUE, closest = -1;
		int low = 0, high = arr.length - 1;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (min_diff > Math.abs(arr[mid] - target)) {
				min_diff = Math.abs(arr[mid] - target);
				closest = mid;
			}

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return closest;
	}
}
