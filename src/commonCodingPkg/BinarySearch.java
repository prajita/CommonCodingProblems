package commonCodingPkg;

public class BinarySearch {
	public static void main(String args[]) {

		int[] arr = new int[] { 2, 7, 8, 9, 10, 13, 10, 16, 19 };
		int val=19;
		System.out.println("element "+val +" found in position::"+(binarySearch(arr, 0, arr.length - 1, val)+1));
	}

	private static int binarySearch(int[] arr, int left, int right, int val) {

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == val) {
				return mid;
			} else if (arr[mid] < val) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;

	}
}
