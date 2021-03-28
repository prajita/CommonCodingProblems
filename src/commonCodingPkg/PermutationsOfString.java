package commonCodingPkg;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PermutationsOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			List<String> list = new ArrayList<String>();
			list = permutation(sc.next());
			list.stream().sorted().forEach(e -> System.out.print(e + " "));
			System.out.println();
		}

	}

	public static List<String> permutation(String str) {
		List<String> p = new ArrayList<String>();
		callperm(str, 0, p);
		return p;
	}

	public static void callperm(String str, int fixed, List<String> p) {
		if (fixed == str.length() - 1) {
			p.add(str);
		} else {
			for (int i = fixed; i < str.length(); i++) {
				str=swap(str, i, fixed);
				callperm(str, fixed + 1, p);
				str=swap(str, i, fixed);
			}
		}
	}

	public static String swap(String str, int i, int fixed) {
		char[] charset = str.toCharArray();
		char temp = charset[i];
		charset[i] = charset[fixed];
		charset[fixed] = temp;

		return String.valueOf(charset);
	}
	
}