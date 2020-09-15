package commonCodingPkg;

public class RearrangeNegetivePositive {
	public static void rearrange(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			if(temp>0) {
				continue;
			}
			int j=i-1;
			while(j>=0 && arr[j]>0) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int e:arr){
			System.out.print(e+" ");

		}

	}

	public static void main(String args[]) {
		int[] arr = new int[] { 3, 9, -11, -5, 32, -7, 23, -43 };
		rearrange(arr);
	}
}
