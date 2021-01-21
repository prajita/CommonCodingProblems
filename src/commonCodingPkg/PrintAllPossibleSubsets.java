package commonCodingPkg;

public class PrintAllPossibleSubsets {
	public static void main(String args[]) {

		int arr[] = new int[] { 3, 6, 8, 2, 10 };
		printSubsets(arr, 0, 0);
	}

	private static void printSubsets(int[] arr, int start, int end) {
		if(end==arr.length)return;
		if(start>end) {
			printSubsets(arr, 0, end+1);
		}else {
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+"    ");				
			}
			System.out.println();
			printSubsets(arr, start+1, end);
		}
	}
}
