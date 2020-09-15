package commonCodingPkg;

public class FindSubarraysWithmOddNums {
	 public static int countSubArrays(int[] a,int m) {
		 int count=0,n=a.length;
		 for(int i=0;i<n;i++) {
			 int odd=0;
			 for(int j=i;j<n;j++) {
				 if(a[j]%2!=0) {
					 odd++;
				 }
				 if(odd==m) {
					 count++;
				 }
			 }
		 }
		 
		 
		 return count;
	 }
	 public static void main(String args[] ) throws Exception {
		 int[] arr=new int[] {3,7,31,8,5,15,16,11};
		 System.out.println(countSubArrays(arr,3));
	 }
}
