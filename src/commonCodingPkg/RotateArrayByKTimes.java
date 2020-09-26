package commonCodingPkg;

public class RotateArrayByKTimes {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 4, 2, 8, 12, 6 };
		int k = 3;
		for (int j = 0; j < k; j++) {
			arr = rotateRight(arr);
		}
		for (int i : arr) {
			System.out.print(i + "   ");
		}
	}

	private static int[] rotateRight(int[] arr) {
		int temp = arr[arr.length - 1], i = arr.length - 1;

		while (i >= 1) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[0] = temp;
		return arr;
	}
}

