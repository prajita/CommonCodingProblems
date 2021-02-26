package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;

public class Zigzag {
	public static void main(String args[]) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}

	public static String convert(String s, int numRows) {

		int pos = 0;
		boolean incr = true;
		Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();

		for (char c : s.toCharArray()) {
			if (pos == numRows)
				incr = false;
			if (pos == 1)
				incr = true;

			if (incr)
				pos++;
			else
				pos--;
			if (!map.containsKey(pos)) {
				map.put(Integer.valueOf(pos), new StringBuilder());
			}
			map.get(pos).append(c);
		}
		StringBuilder res = new StringBuilder();

		for (Integer e : map.keySet()) {
			res.append(map.get(e));
		}
		return res.toString();
	}
}
