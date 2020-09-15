package commonCodingPkg;

public class MedianOf2SortedArrays {
	public static double findMedian(int[] a, int[] b) {
		int m=a.length;
		int n=b.length;
		int low=0,high=m;
		while(low<=high) {
			int partition_a=(low+high)/2;
			int partition_b=(m+n+1)/2-partition_a;
			int leftMax_a=partition_a==0?Integer.MIN_VALUE:a[partition_a-1];
			int rightMin_a=partition_a==m?Integer.MAX_VALUE:a[partition_a];
			
			
			int leftMax_b=partition_b==0?Integer.MIN_VALUE:b[partition_b-1];			
			int rightMin_b=partition_b==n?Integer.MAX_VALUE:b[partition_b];
			
			if(leftMax_a<=rightMin_b && leftMax_b<=rightMin_a) {
				if((m+n)%2==0) {
					return (double)(Math.max(leftMax_a, leftMax_b)+Math.min(rightMin_a, rightMin_b))/2;
				}else {
					return (double)Math.max(leftMax_a, leftMax_b);
				}
			}else if(leftMax_a>rightMin_b) {
				high=partition_a-1;
			}else {
				low=partition_a+1;
			}
		}
		throw new IllegalArgumentException();
		
	}
	public static void main (String[] args) {
		int[] a=new int[] {-5, 3, 6, 12, 15};
		int[] b=new int[] {-12, -10, -6, -3, 4, 10};
		System.out.println(findMedian(a,b));
}
}
