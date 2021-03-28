package testSorting;

import java.util.stream.IntStream;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = { 5, 9, 2, 10, 15, 4, 8, 7 };
		callBubble(arr);
		IntStream.of(arr).forEach(e -> System.out.print(e + "\t"));
	}

	private static void callBubble(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
}
