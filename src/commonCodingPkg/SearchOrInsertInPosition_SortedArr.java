package commonCodingPkg;

public class SearchOrInsertInPosition_SortedArr {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 5,6};
		int target=7;
		
		System.out.println(findPositionInsortedArr(arr, target));
		
	}

	private static int findPositionInsortedArr(int[] arr, int target) {

		int upper=arr.length, lower=1, res=Integer.MAX_VALUE;
		int mid=0;
		while(upper>=lower) {
			mid= lower+(upper-lower)/2;
			if(mid==arr.length) {
				return res=arr.length;
			}else if(mid<0) {
				return 1;
			}
			if(arr[mid]==target) {
				res= mid;
				break;
			}else if((arr[mid-1]<target && arr[mid]>target)) {
				res=mid;
				break;
			}else if(arr[mid]>target) {
				System.out.println();
				upper=mid-1;
			}else {
				lower=mid+1;
			}
		}
		
		return res;
	}
}
