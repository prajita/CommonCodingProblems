package commonCodingPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Given a list of integers, determine is the list contains a loop of 2 or more repeating values. 
//
//Input Format
//The first line of input consists of number of integers in the list, N.
//The second line of input consists of N comma separated integers.

//Constraints
//1<= N <=100

//Output Format
//Print the numbers (comma separated) that are repeated and print -1 if no such numbers are repeated.

public class RepeatingValue {
	public static void main(String args[]) throws Exception {
		System.out.println("give input ::");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("give input ::");
		String in = sc.next();
		sc.close();
		String[] listIn = in.split(",");
		int[] inArray = new int[n + 1];
		int count = 0;
		for (String s : listIn) {
			int input = Integer.parseInt(s);
			inArray[count] = input;
			count++;
		}

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Set<Integer> l = new LinkedHashSet<Integer>();
		for (int i = 0; i < inArray.length; i++) {
			if (m.containsKey(inArray[i])) {
				l.add(inArray[i]);
			} else {
				m.put(inArray[i], 1);
			}
		}
		l.stream().forEach(System.out::println);

	}
}
