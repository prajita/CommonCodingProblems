package commonCodingPkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindElementInArrayNotSorted {
	public static void main(String args[]) {
		int[] in=new int[] {2, 6, 8, 1, 9, 11};
		int sum=10;
		List<int[]> list=new ArrayList<>();
		list=callUtil(in, sum);
		
		list.stream().forEach(e->System.out.print(e[0]+" "+e[1]+"    "));
		
	}

	private static List<int[]> callUtil(int[] arr, int sum) {

		List<int[]> list=new ArrayList<>();
 		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int[] temp=new int[2];
			if(set.contains(sum-arr[i])) {
				temp[0]=arr[i];
				temp[1]=sum-arr[i];
				list.add(temp);
			}
			
			set.add(arr[i]);
		}
		
		return list;
	}
}
