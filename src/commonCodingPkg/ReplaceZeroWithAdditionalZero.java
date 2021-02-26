package commonCodingPkg;

public class ReplaceZeroWithAdditionalZero {
	public static void main(String args[]) {
		int[] res = callUtil(new int[] { 2, 1, 0, 5, 6, 0,  0,0,  4, 0, 6, 9, 1, 2, 3, 4 ,5});

		for (int i : res) {
			System.out.println(i );
		}
	}

	private static int[] callUtil(int[] arr) {
		int i = 0;
		int len = arr.length;
		while (i < len-1) {
			if (arr[i] == 0) {
				for (int j = len - 2; j >= i + 1; j--) {
					arr[j + 1] = arr[j];
				}
				arr[i + 1] = 0;
				i=i+2;
			}else {
				i++;
			}			
			System.out.println();
		}
		return arr;
	}
}
