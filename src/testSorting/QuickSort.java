package testSorting;

import java.util.stream.IntStream;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 80, 90, 10, 70 };
		callQuickSort(arr, 0, arr.length - 1);
		IntStream.of(arr).forEach(e -> System.out.println(e));

	}

	private static void callQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			callQuickSort(arr, low, p - 1);
			callQuickSort(arr, p + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
