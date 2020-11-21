package commonCodingPkg;

public class FInd2smallestNumbersInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 11, -11, 7, 1, 5, 2 };

		find2ndSmallest(arr);
	}

	private static void find2ndSmallest(int[] arr) {
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] > first) {
				second = arr[i];
			}
		}
		System.out.println("second smallest::" + second);
		System.out.println("smallest::" + first);
	}
}
