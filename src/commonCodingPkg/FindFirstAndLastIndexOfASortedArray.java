package commonCodingPkg;

public class FindFirstAndLastIndexOfASortedArray {

	public static void main(String args[]) {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] res = searchRange(nums, target);
		System.out.print(res[0] + "   " + res[1]);
	}

	public static int[] searchRange(int[] nums, int target) {

		int len = nums.length;
		int left = findFirst(nums, target);
		int right = findLast(nums, target);

		return new int[] { left, right };
	}

	private static int findFirst(int[] nums, int target) {

		int left = 0, right = nums.length -1;
		int res = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] < target) {

				left = mid + 1;
			} else {
				right = mid - 1;
			}
			if (nums[mid] == target) {
				res = mid;
			}
		}
		return res;
	}

	private static int findLast(int[] nums, int target) {
		int left = 0, right = nums.length-1 ;
		int res = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
			if (nums[mid] == target) {
				res = mid;
			}
		}
		return res;
	}
}
