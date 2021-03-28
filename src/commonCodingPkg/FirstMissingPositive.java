package commonCodingPkg;

import java.util.Arrays;

public class FirstMissingPositive {
	public static void main(String[] args) {
		int arr[] = new int[] { 1};

		int res = findFirstMissingPositive(arr);

		System.out.print(res);

	}

	private static int findFirstMissingPositive(int[] nums) {

		int i = 0, res = 1;
		int len = nums.length;

		Arrays.sort(nums);
		while (i < len && nums[i] <= 0) {
			i++;
		}
		if (i<len && nums[i] > 1) {
			return 1;
		}
		while (i < len - 1) {
			if (nums[i + 1] == nums[i] + 1) {
				i++;
			} else {
				return nums[i] + 1;
			}
		}
		if(i<len) {
			return nums[i] + 1;
		}else {
			return nums[i-1]+1;
		}
		

	}

}
