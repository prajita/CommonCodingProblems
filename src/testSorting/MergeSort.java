package testSorting;

public class MergeSort {

	public static void merge(int[] arr, int l, int mid, int n) {

		int[] left = new int[mid - l + 1], right = new int[n - mid];
		int n1 = mid - l + 1;
		int n2 = n - mid;
		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	public static void sort(int arr[], int l, int n) {
		if (l < n) {
			int mid = (l + n) / 2;
			sort(arr, l, mid);
			sort(arr, mid + 1, n);
			merge(arr, l, mid, n);
		}

	}

	public static void main(String args[]) {
		int[] arr = { 5, 9, 2, 10, 15, 4, 8, 7 };
		System.out.println("input array:\n");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);
		System.out.println("\nsorted\n");

		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

}
