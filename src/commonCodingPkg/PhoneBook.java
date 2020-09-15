package commonCodingPkg;

import java.util.*;
import java.io.*;

class PhoneBook {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		int[] phone = new int[100000];
		for (int i = 0; i < n; i++) {
			String l = bf.readLine();
			String name = l.split(" ")[0];
			int number = Integer.parseInt(l.split(" ")[1]);
			map.put(name, number);
			phone[i] = number;
		}
		List<String> list = new ArrayList<String>();
		String str;
		while ((str = bf.readLine()).length() > 0) {
			list.add(str);
		}
		//hackerrank-scanner.hasNext() will work
		for (String s : list) {
			Integer p = map.get(s);
			if (p == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + p);
			}
		}
	}
}
