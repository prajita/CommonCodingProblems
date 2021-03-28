package commonCodingPkg;

public class PrintAllPossibleSubArrays {
	public static void main(String args[]) {

		int arr[] = new int[] { 3, 6, 8, 2, 10 };
		printSubArrays(arr, 0, 0);
	}

	private static void printSubArrays(int[] arr, int start, int end) {
		if(end==arr.length)return;
		if(start>end) {
			printSubArrays(arr, 0, end+1);
		}else {
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+"    ");				
			}
			System.out.println();
			printSubArrays(arr, start+1, end);
		}
	}
}
