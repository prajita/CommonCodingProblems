package commonCodingPkg;

public class MoveZeroesToEnd {
	
	public static int[] moveZeroes(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				if(i!=j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr= {2,5,0,0,7,8,0,0,9};
		int[] res=moveZeroes(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
