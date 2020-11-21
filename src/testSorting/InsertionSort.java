package testSorting;

import java.util.stream.IntStream;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = { 5, 9, 2, 10, 15, 4, 8, 7 };
		callInsertion(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}

	private static void callInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >=0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
