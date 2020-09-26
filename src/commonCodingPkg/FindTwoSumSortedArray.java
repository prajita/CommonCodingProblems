package commonCodingPkg;

import java.util.Arrays;

public class FindTwoSumSortedArray {
	
	public static void main(String[] args) {
		int[] arr= new int[] {2, 3, 4};
		int[] res = twoSum(arr, 6);
		System.out.println(res[0]+1);
		System.out.println(res[1]+1);
		
	}
	    public static int[] twoSum(int[] numbers, int target) {
	        int length = numbers.length;
	        int[] result= new int[2];
	        for(int i=0;i<length;i++){
	            
	            int temp=numbers[i];
	            int pos = searchElement(numbers, target-temp, 0, length-1);
	            if(pos!=-1) {
	        	   result[0]=i+1;
	        	   result[1]=pos+1;
	        	   break;
	           }
	             
	        }
	        Arrays.sort(result);
	        return result;
	    }
	    
	    public static int searchElement(int[] arr, int val, int left, int right ){
	        int mid = left+(right-left)/2;
	        if(right>=left) {
	        	if(arr[mid]==val) {
	        		return mid;
	        	}
	        	if(arr[mid]<val){
		             return searchElement(arr, val, mid+1, right);
		        }else{
		             return searchElement(arr, val, left, mid-1);  
		        }
	        }
	        
	        return -1;
	    }
	
}
