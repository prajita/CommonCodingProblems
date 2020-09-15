package starPattern;

import java.util.Scanner;

public class printPattern1 {
	public static String reverseString(String str) {
		return str.equalsIgnoreCase("")?"":reverseString(str.substring(1))+str.charAt(0);
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number of increasing star value::");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=i-1;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("reverse your name::"+reverseString("prajita sinha"));
	}
}
