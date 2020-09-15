package starPattern;

import java.util.Scanner;

public class pattern1234 {
	public static void paintPattern(int a) {
		int count=1;
		for(int i=0;i<a;i++) {
			for(int j=a-i;j>=0;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
				System.out.print("   ");
			}
			System.out.println();
		}
		
		for(int i=a;i>0;i--) {
			for(int j=0;j<a-i;j++) {
				System.out.print("   ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(count++);
				System.out.print("   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number of increasing star value::");
		int n=sc.nextInt();
		paintPattern(n);
	}

}
