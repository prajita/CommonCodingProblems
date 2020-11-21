package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;

public class FindPairInUnsortedArrayWithGivenSum {
	public static void main(String[] args) {
		
		int[] arr=new int[]{3, 1, 4, 0};	
		if(arr.length==0)System.out.println("no elements in the array ");
		System.out.println(findPair(arr, 5));
	}
	
	public static boolean findPair(int[] arr, int sum) {
		
		Set<Integer> set =new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int temp=sum-arr[i];
			if(set.contains(temp)) {
				System.out.println("pair::"+temp+" "+arr[i]);
				return true;
			}else {
				set.add(arr[i]);
			}
		}
		return false;
		
	}

}
