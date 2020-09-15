package commonCodingPkg;

public class MaximumSumForKsizeWIndow {
	
	 public static int findMaxSumInKwindow(int[] arr,int k) {
		int curr_sum=arr[0],global_sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			curr_sum=Math.max(arr[i],curr_sum+arr[i]);
			if(global_sum<curr_sum) {
				global_sum=curr_sum;
			}
		}		
		return global_sum;
	 }
    public static void main(String args[] ) throws Exception {
    	
//    	int [] arr=new int[]{3,79,9,2,5,10,41,10,24,4,2};
    	int [] arr=new int[]{-2,3,2,1,8};
    	System.out.println(findMaxSumInKwindow(arr,3));
    }
}
