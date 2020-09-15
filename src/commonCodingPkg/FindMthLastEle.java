package commonCodingPkg;

import java.io.*;
import java.util.*;
import java.util.LinkedList; 


public class FindMthLastEle {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int number = Integer.parseInt(bf.readLine());
		List<Integer> list = new LinkedList<Integer>();

		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		if (number > list.size()) {
			System.out.println("NIL");
		}else {
			Integer counter=0;
			int k=list.size()-number;
			System.out.println(list.get(k));
		}

	}
}
