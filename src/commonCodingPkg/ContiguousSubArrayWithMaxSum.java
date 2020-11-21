package commonCodingPkg;

public class ContiguousSubArrayWithMaxSum {
	public static void main(String[] args) {
		int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3};
		int res=findsubarr(arr);
		System.out.println(res);
	}

	private static int findsubarr(int[] arr) {
		if(arr.length==0) return 0;
		int curr=arr[0], max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			curr=Math.max(arr[i], curr+arr[i]);
			max=Math.max(curr, max);
			
		}
		return max;
	}
}
