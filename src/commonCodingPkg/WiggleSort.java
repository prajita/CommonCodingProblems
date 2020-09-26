package commonCodingPkg;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WiggleSort {
	public static void main(String... args) {

		int[] input = new int[] { 3, 2, 1, 5, 6, 4 };

		wiggle(input);
	}

	private static void wiggle(int[] input) {

		List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toList());
		Collections.sort(list,(a,b)->a-b);

		for(int i=0;i<list.size();i=i+2) {
			
			int temp = list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1, temp);
		}
		list.stream().forEach(e->System.out.print("  "+e));
	}
}
