package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsetsWithTargetSum {
	static int count=0;
	public static void main(String... args) {

		List<List<Integer>> res = new ArrayList<>();
		List<Integer> curr= new ArrayList<>();
		
		int [] arr= new int[] {3, 6, 1, 0, 1,1, 0,  2};
		Arrays.sort(arr);
		callUtil(arr, 0, 5,0, curr, res);
		
		for(List<Integer> e: res) {
			System.out.println(e);
		}
		System.out.println(count);
	}
	private static void callUtil(int[] arr, int index,int target,int sum, List<Integer> curr, List<List<Integer>> res) {

		if(target==sum) {
			res.add(new ArrayList<>(curr));
			count++;
			return;
		}
		if(index>arr.length || sum>target) {
			return ;
		}
		
		for(int i=index;i<arr.length;i++) {
			if(i==index|| arr[i]!=arr[i-1]) {
				curr.add(arr[i]);
				callUtil(arr, i+1, target,sum+arr[i] ,curr, res);
				curr.remove(curr.size()-1);
			}
		
		}
		
	}

}
