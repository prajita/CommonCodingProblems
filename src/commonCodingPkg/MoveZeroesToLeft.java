package commonCodingPkg;

public class MoveZeroesToLeft {
	static int[] moveZeroes(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]==0) {
				if(i!=j && arr[i]!=arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				j++;
			}		
			
		}
		return arr;
	}
	public static void main (String[] args) 
	{ 
		int[] arr= {3,0,6,0,31,6,8,0,4,1}; 
		for(int a: moveZeroes(arr,arr.length)) {
			System.out.println(a);
		}
	}
}
