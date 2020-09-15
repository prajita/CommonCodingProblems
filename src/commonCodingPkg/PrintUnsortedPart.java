package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class PrintUnsortedPart {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = s.nextInt();
		
		int a[]=new int[n];
		System.out.print("Enter all the elements you want in array:\n");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			System.out.println("print next number::"+a[i]);
		}
		System.out.println("end of adding numbers.");
		System.out.println("print array::");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		int[] p=findUnsorted(a);
		System.out.println("p0"+p[0]);

		System.out.println("p1"+p[1]);
		List<Integer> result=new ArrayList<Integer>() ;
		System.out.println("result:::\n");
		for(int i=p[0];i<=p[1];i++){
			result.add(a[i]);
			
		}
		int min=Collections.min(result);
		if(a[p[0]-1]<min){
			result.add(a[p[0]-1]);
		}
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		
	}

	private static int[] findUnsorted(int arr[]) {
		int n[]=new int[2];
		for(int i=arr.length-1;i>0;i--){
			if(arr[i]<arr[i-1] ){
				System.out.println("gggg"+arr[i]);
				n[1]=i;
				break;
			}
		}
		for(int j=0;j<arr.length-1;j++){
			if(j<n[1] && arr[j]>arr[j+1]){
				n[0]=j;
				break;
			}
		}
		System.out.println("print 1st and last result array index::"+n[0]+" "+n[1]);
		return n;
		
	}
}
