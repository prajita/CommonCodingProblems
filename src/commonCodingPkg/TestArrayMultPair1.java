package commonCodingPkg;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrayMultPair1 {
	public static int[] getNumber(int n, int[] arr) {
		int[] num = new int[2];
		Arrays.sort(arr);
		int r = arr.length-1;
		int l = 0;
		while (l < r) {
			if (arr[l] * arr[r] == n) {
				num[0]=arr[l];
				num[1]=arr[r];
				break;
			} else if(arr[l]* arr[r]>n) {
				r--;
				
			}else {
				l++;				
			}
		}
		System.out.println("num::");
		
		return num;
	}

	public static void main(String args[]) {
		int[] arr = { 3, 5, 4, 6, 8, 2, 10 };
		for(int t:arr) {
			System.out.print(t+" ");
		}
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		System.out.println("to check for::"+result);
		int[] n=getNumber(result, arr);
		if(n.length>0) {
			System.out.println(n[0]+" "+n[1]);
		}else {
			System.out.println("no number as such");
		}
		
	}
}
