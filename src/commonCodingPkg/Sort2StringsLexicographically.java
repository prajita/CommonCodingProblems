package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class Sort2StringsLexicographically {
	/***
	 * 
	 * Java compareTo() method. The method compareTo() is used for comparing two
	 * strings lexicographically in Java
	 * 
	 * @param args
	 * 
	 *             https://chortle.ccsu.edu/java5/Notes/chap92/ch92_2.html
	 */
	public static void main(String args[]) {
		String a = "albany";
		String b = "albatross";

		List<String> words = new ArrayList<String>();
		words.add(a);
		words.add(b);
		words.add("apple");
		words.add("banana");
		words.add("guava");
		words.add("banani");
		words.add("ban");
		words.add("pinapple");
		
		System.out.println(checkLexicographicalOrder(a, b));
		words.stream().sorted((n, m)->checkLexicographicalOrder(n,m)).forEach(e->System.out.println(e));
		
	}

	private static int checkLexicographicalOrder(String a, String b) {
		int M = a.length();
		int N = b.length();

		for (int i = 0; i < M && i < N; i++) {
			if (a.charAt(i) == b.charAt(i)) {
				continue;
			} else {
				if (a.charAt(i) < b.charAt(i)) {
					System.out.println("order is::" + a + "    " + b);
					return -1;
				} else {
					System.out.println("order is::" + b + "    " + a);
					return 1;
				}
			}
		}

		if (M < N) {
			System.out.println("order is::" + a + "    " + b);
			return -1;
		} else if (M > N) {
			System.out.println("order is::" + b + "    " + a);
			return 1;
		} else {
			System.out.println("both equal");
			return 0;
		}
		
		//return a.compareTo(b);
	}
}
