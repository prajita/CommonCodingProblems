package commonCodingPkg;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetFirstLetter {
	public static void main(String[] args) {
		System.out.println("input::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(),sb="";
		List<Character> outArr = new ArrayList<Character>();
		char[] charlist = str.toCharArray();
		
		outArr.add(charlist[0]);
		for (int i = 0; i < charlist.length; i++) {

			if (Character.isWhitespace(charlist[i]) && i + 1 < charlist.length) {
				outArr.add((Character)charlist[i + 1]);
			}
		}
		for(Character c: outArr) {
			System.out.print(c );
			
		}
	}
}
