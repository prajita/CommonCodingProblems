package commonCodingPkg;

public class PrintAllSubArrays {
	public static void main(String args[]) {
		int[] arr = new int[] { 4, 7, 9, 1, 6, 8, 11 };
		printAllSubArray(arr);

	}

	private static void printAllSubArray(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-i; j++) {

				for (int k = j; k <= i+j; k++) {
				System.out.print(arr[k] + "  ");
				}
				System.out.println();
			}
			
		}
	}
}
