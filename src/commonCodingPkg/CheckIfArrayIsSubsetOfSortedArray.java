package commonCodingPkg;

public class CheckIfArrayIsSubsetOfSortedArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 0, 2,6,  7, 9, 14, 16, 20, 37 };
		int subarr[] = new int[] { 6, 0, 7, 36 };

		System.out.println(checksubset(arr, subarr));

	}

	private static boolean checksubset(int[] arr, int[] subarr) {
		
		for(int i=0;i<subarr.length;i++) {
			
			if(!binarySearch(arr, subarr[i])) {
				break;
			}
			if(i==subarr.length-1)return true;
		}
		return false;
	}

	private static boolean binarySearch(int[] arr,int i) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==i) {
				return true;
			}else if(arr[mid]<i) {
				low=mid+1;				
			}else {
				high=mid-1;
			}
		}
		return false;
	}
}
