package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] in = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] res = merge(in);

		for (int i = 0; i < res.length && res[i][0] != 0; i++) {
			System.out.print(res[i][0] + "   ");
			System.out.print(res[i][1]);
			System.out.println();
		}
	}

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> {
			if (a[0] == b[0])
				return b[0] - a[0];
			return a[0] - b[0];

		});
		
		List<int[]> res = new ArrayList<int[]>();
		
		if(intervals.length==1) return intervals;
		
		for(int[] e: intervals) {
			if(res.isEmpty() || res.get(res.size()-1)[1]<e[0]) {
				res.add(e);
			}else {
				
				int[] previousTime = res.get(res.size() - 1);
                previousTime[1] = Math.max(previousTime[1], e[1]);
                
			}
		}
		return res.toArray(new int[][] {});
		
		
	}
}