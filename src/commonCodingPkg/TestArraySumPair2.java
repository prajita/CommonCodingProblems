package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;

public class TestArraySumPair2 {
	public static void  getPair(int[] arr, int n) {
		Set<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int temp = n -arr[i];
			if (temp >= 0 && h.contains(temp)) {
				System.out.println("res::"+arr[i] + ", " + temp);
				
			}
			h.add(arr[i]);
		}
		
	}

	public static void main(String args[]) {
		int[] arr = { 2, 5, 8, 3, 7, 9, 4,0 };
		System.out.println("intput:::");
		for (final int i : arr) {
			System.out.print(" " + i);
		}
		int n = 8;
		getPair(arr, n);

	}
}
