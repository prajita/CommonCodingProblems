package commonCodingPkg;

public class FindTripletWithSum {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 7, 9, 11, 16, 20 };
		int sum = 21;
		findTriplet(arr, sum);
	}

	private static int findTriplet(int[] arr, int sum) {
		int k = arr.length - 1, partsum;
		int[] res = new int[2];
		while (k >= 2) {
			int i = 0, j = k - 1;
			res = findSum(arr, i, j, sum - arr[k]);
			if (res[0] == Integer.MAX_VALUE) {
				k = k - 1;
			} else {
				System.out.println("triplets::" + arr[res[0]] + "  " + arr[res[1]] + "  " + arr[k]);
				return -1;
			}
		}
		return -1;
	}

	private static int[] findSum(int[] arr, int i, int j, int sum) {
		int[] res = new int[2];
		res[0] = Integer.MAX_VALUE;
		res[1] = Integer.MAX_VALUE;
		while (i < j) {

			if (arr[i] + arr[j] == sum) {
				res[0] = i;
				res[1] = j;
				return res;
			} else if (arr[i] + arr[j] < sum) {
				i++;
			} else {
				j--;
			}
		}
		return res;
	}

}
