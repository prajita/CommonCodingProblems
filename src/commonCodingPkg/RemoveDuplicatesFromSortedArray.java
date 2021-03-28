package commonCodingPkg;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {

		int[] arr = new int[] { 2, 7, 8, 9, 10,  10,13, 13, 13, 16, 19 };
		int  end_index =removeDuplicates(arr, arr.length);
		for (int i=0; i<end_index; i++) 
	        System.out.print(arr[i]+" "); 
		
	}

	private static int removeDuplicates(int[] arr, int n) {
		
		if (n == 0 || n == 1) 
            return n; 
       
        int start = 0; 
  
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[start++] = arr[i]; 
       
        arr[start++] = arr[n-1]; 
       
        return start;
	}
	
	
}
