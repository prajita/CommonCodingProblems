package commonCodingPkg;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElementFromSpecificIndex {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 7, 6, 3, 4, 0, 11, 7, 1 };

		int [] res=removeIndextest2(arr, 2);
		
		IntStream.of(res).forEach(e->System.out.print(e+"   "));

	}

	
	//arraycopy
	
	/*
	 * Parameters : 
		source_arr : array to be copied from
		sourcePos : starting position in source array from where to copy
		dest_arr : array to be copied in
		destPos : starting position in destination array, where to copy in
		len : total no. of components to be copied.
	 * 
	 */
	private static int[] removeIndextest1(int[] arr, int index) {

		int [] res=new int[arr.length-1];
		System.arraycopy(arr, 0, res, 0, index);
		System.arraycopy(arr, index+1, res, index, arr.length-index-1);
		
		return res;
	}
	
	private static int[] removeIndextest2(int[] arr, int index) {

		int [] res=new int[arr.length-1];
		
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		list.remove(index);
		res=list.stream().mapToInt(e->e).toArray();
		return res;
	}
	
	
	
}
