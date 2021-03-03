package commonCodingPkg;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
	public class Interval {

		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String args[]) {
//		Interval[] intervals = new Interval[4];
//		MeetingRooms2 m = new MeetingRooms2();
//		intervals[0] = m.new Interval(0, 30);
//		intervals[1] = m.new Interval(5, 10);
//		intervals[2] = m.new Interval(15, 20);
//		intervals[3] = m.new Interval(22, 50);

		Interval[] intervals = new Interval[2];
		MeetingRooms2 m = new MeetingRooms2();
		intervals[0] = m.new Interval(2, 7);
		intervals[1] = m.new Interval(4, 10);


		
		if (intervals == null || intervals.length == 0) {
			System.out.println("result:: 0");
		}
		System.out.println("result::" + callUtil(intervals));

		int[] a1 = new int[] {2, 7};
		int[] a2 = new int[] { 4, 10 };

		System.out.println("result2::" + callUtil2(a1, a2));
	}

	private static int callUtil2(int[] a1, int[] a2) {
		int res = 1;
		int i=1, j=0;
		while(i<a1.length && j<a2.length) {
			if(a1[i]>a2[j]) {
				j++;
			}else {
				res++;
			}
			i++;
		}

		return res;
	}

	private static int callUtil(Interval[] intervals) {
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		PriorityQueue<Interval> minHeap = new PriorityQueue<Interval>((a, b) -> a.end - b.end);

		minHeap.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			Interval current = intervals[i];
			Interval earliest = minHeap.remove();
			System.out.println(earliest.end);
			if (current.start >= earliest.end) {
				earliest.end = current.end;
			} else {
				minHeap.add(current);
			}
			minHeap.add(earliest);
		}

		return minHeap.size();
	}

}
