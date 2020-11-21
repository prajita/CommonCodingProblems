package commonCodingPkg;

import java.io.IOException;

//class to find the element which is greater then previous element and less than next element-return index
public class FindPeakElement {
	public static void main(String[] args) throws IOException {

		int[] arr = new int[] { 3, 7, 4, 5, 2, 1, 6, 9 };

		System.out.println(findpeak(arr));
	}

	private static int findpeak(int[] arr) {
		int left = 0, right = arr.length-1;

		while (right > left) {
			int mid = left + (right - left) / 2;
			if (arr[mid] < arr[mid + 1]) {
				left = mid + 1;
			} else {
				right = mid ;
			}
		}
		return left;
	}
}
