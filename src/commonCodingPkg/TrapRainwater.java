package commonCodingPkg;

public class TrapRainwater {
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 3, 2, 2, 5 };
		calculate(arr);
	}

	private static void calculate(int[] arr) {
		int len = arr.length;
		int[] left = new int[len];
		int[] right = new int[len];
		int res=0;
		left[0] = arr[0];

		for (int i = 1; i < len; i++) {

			left[i] = Math.max(left[i - 1], arr[i]);
		}
		right[len-1] = arr[len-1];

		for (int i = len - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}		
		
		for(int i=0;i<len;i++) {
			res+=Math.min(left[i], right[i])-arr[i];
		}
		System.out.println(res);
	}
}
