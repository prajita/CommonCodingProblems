package commonCodingPkg;

public class CountSubarraysWithOddSum {

	public static int countSubarrays(int[] arr,int arrsize ) {
		int count=0;
		for(int i=0;i<arrsize;i++) {
			int sum=0;
			for(int j=i;j<arrsize;j++) {
				sum+=arr[j];
				if(sum%2!=0) {					
					count++;
				}
			}
		}
		return count;
		
	}
	public static void main (String[] args) 
	{ 
		int a[] = {2, 2, 5, 6, 9, 2, 11 }; 
		int n = a.length; 
		
		System.out.println(countSubarrays(a, n)); 
	} 
}
