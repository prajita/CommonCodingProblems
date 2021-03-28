package commonCodingPkg;

public class RotateArrayByKTimes {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		
		k=k%arr.length;
		arr=reverse(arr, 0, arr.length-1);
		arr=reverse(arr, 0, k-1);
		arr=reverse(arr, k, arr.length-1);
		
		for(int e: arr) {
			System.out.println(e);
		}
		
		
		
		
//		for (int j = 0; j < k; j++) {
//			arr = rotateRight(arr);
//		}
//		for (int i : arr) {
//			System.out.print(i + "   ");
//		}
	}

	/*private static int[] rotateRight(int[] arr) {
		int temp = arr[arr.length - 1], i = arr.length - 1;

		while (i >= 1) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[0] = temp;
		return arr;
	}*/
	
	private static int[] reverse(int[] arr, int start, int end) {
		while(start<end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		return arr;
	}
}

