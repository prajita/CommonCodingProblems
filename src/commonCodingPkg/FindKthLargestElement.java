package commonCodingPkg;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindKthLargestElement {
	public static int findKthLargest(int[] arr, int k) {
		//Arrays.asList() returns List<int[]> not List<Integer>, so use stream of JAVA 8
		
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		list = list.stream().sorted((a, b)-> b-a).skip(k-1).limit(1).collect(Collectors.toList());
		
		
		return list.get(0);
	}
	public static void main(String ... args) {
		
		int[] input = new int [] {3,2,1,5,6,4};
		int k=2;
		
		System.out.println(findKthLargest(input, k));
	}
}
