package commonCodingPkg;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTwoSumSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 8, 14, 15, 15 };
		int[] res = twoSum(arr, 29);
		if (res[0] != -1) {
			System.out.println(res[0]);
			System.out.println(res[1]);
		} else {
			System.out.println("no pair found");
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int length = numbers.length;
		int[] result = new int[2];
		for (int i = 0; i < length; i++) {

			int temp = numbers[i];
			int pos = searchElement(numbers, target - temp, 0, length - 1);
			if (pos != -1) {
				result[0] = numbers[i];
				result[1] = numbers[pos];

				if (result[0] == result[1]) {
					if (IntStream.of(numbers).filter(e -> e == result[0]).count() <= 1) {
						result[0] = -1;
						result[1] = -1;
					}
				}
				break;
			}

		}
		Arrays.sort(result);

		return result;
	}

	public static int searchElement(int[] arr, int val, int left, int right) {

		while (right >= left) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == val) {
				return mid;
			}
			if (arr[mid] < val) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

}
