package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubArraysRecursive {
	public static void printSubArray(int[] input,int start,int end) {
		if(end==input.length) {return;}
		else if(start>end) {
			printSubArray(input,0,end+1);
		}
		else {
			for(int i=start;i<=end;i++) {
				System.out.print(input[i]+" ");
			}	
			System.out.println();
			printSubArray(input, start+1, end);
		}
		
	}
	public static void main(String args[]) {
		int[] arr=new int[] {4,7,1,9,4,7,11};
		printSubArray(arr,0,0);		
		
	}
}
