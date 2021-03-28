package commonCodingPkg;

public class ReplaceZeroWithAdditionalZero {
	public static void main(String args[]) {
		//int[] res = callUtil(new int[] { 2, 1, 0, 5, 6, 0,  0,0,  4, 0, 6, 9, 1, 2, 3, 4 ,5});
		//int[] res = callUtil(new int[] { 2, 1, 0, 5, 6, 0,  5, 7,0, 0, 0, 7, 3, 1,5 , 2});
		int[] res = callUtil(new int[] { 2, 0, 1, 0, 0, 0, 5});

		for (int i : res) {
			System.out.println(i );
		}
	}
	//O(n*n)
	/*private static int[] callUtil(int[] arr) {
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
	}*/
	
	//complexity O(n) with no extra space
	/*private static int[] callUtil(int[] arr) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0) count++;
		}
		int i=arr.length-count-1;
		while(i>=0) {
			if(arr[i]==0) {
				arr[i+count]=0;
				count--;
				arr[i+count]=0;
			}else {
				arr[i+count]=arr[i];
			}
			i--;
		}
		return arr;
	}*/
	
	private static int[] callUtil(int[] arr) {
		int shift =0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0) shift++;
		}
		int   size = arr.length;
	    for (int i = arr.length- 1; i >= 0; i--) {
	        if (arr[i]==0) shift--;
	        if (i + shift < size) {
	            arr[i + shift] = arr[i];
	            if (arr[i]==0 && i + shift + 1 < size)
	                arr[i + shift + 1] = 0;
	        }
	    }
	    return arr;
	}
}
