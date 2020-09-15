package commonCodingPkg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubarrayWithSum {

	public static void main(String args[]) {

		int[] arr = { 5, 2, 3, 8, 9, 11, 1 };
		int sum = 23;

		subarraySum(arr, sum);
	}

	private static void findSubarray(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			int tempsum = 0;
			for (int j = i; j < length; j++) {
				tempsum = tempsum + arr[j];
				if (tempsum == sum) {

					System.out.println(arr[j]);
				}
			}

		}

	}

	static int subarraySum(int[] nums, int k) {

		int n = nums.length;
		if (n == 0)
			return 0;

		Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		int currSUM = 0;
		int i = 0;
		int count = 0;

		while (i < n) {
			currSUM += nums[i];

			if (currSUM == k) // We found a new subArray with SUM = k
				count += 1;

			if (mymap.get(currSUM - k)!=null)
				count += mymap.get(currSUM - k);

			int p = mymap.get(currSUM);
			p = p + 1;
			i += 1;
		}
		return count;
	}

}
