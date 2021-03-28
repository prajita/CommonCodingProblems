package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
 * 
 * count the number of subsets with a target sum 
 * 
 */
public class CountOfSubsetsFor_TargetSum {

	public static int count;

	public static void main(String args[]) {
		int[] in = new int[] { 1, 2, 3 };
		int target = 4;
		
		List<Integer> list= new ArrayList<>();
		callUtility(in, 0, target, list);
		
		System.out.println("first approach::"+count);
		
		count=0;
		callUtil(in, 0, 0, target);
		
		System.out.println("second approach::"+count);
		
	
		List<Integer> l1= Arrays.asList(1, 2);
		List<Integer> l2= Arrays.asList( 2, 1);
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
	}

	
	private static void callUtility(int[] arr, int index,  int target , List<Integer>  curr) {
		
		
		if(target==0) {
			count++;
			return;
		}
		
		for(int i=index;i<arr.length;i++) {
			
			curr.add(arr[i]);
			callUtility(arr, i+1, target-arr[i], curr);
			curr.remove(curr.size()-1);
			
		}
	}

		
	private static void callUtil(int[] arr, int index, int sum, int target) {

		if (sum == target) {
			count++;
			return;
		}

		if (index >= arr.length || sum > target) {
			return;
		}

		callUtil(arr, index + 1, sum + arr[index], target);

		callUtil(arr, index + 1, sum, target);

	}
}
