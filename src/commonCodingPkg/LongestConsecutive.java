package commonCodingPkg;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestConsecutive {
	public static void main(String[] args) {
		int[] arr = new int[] {9,1,4,7,3,-1,0,5,8,-1,6};

		System.out.println("length of longest consequence:: "+longestConsecutive(arr));

	}

	public static int longestConsecutive(int[] nums) {
		if(nums.length==0)return 0;	
		int maxcount=1,  count = 1;	
		nums = IntStream.of(nums).boxed().sorted().distinct().mapToInt(x -> x).toArray();
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 1) {
				count++;
				maxcount = Math.max(maxcount,count);
			}else {
				count=1;
			}
		}
		return maxcount;
	}
}
