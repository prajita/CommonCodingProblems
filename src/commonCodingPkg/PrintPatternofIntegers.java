package commonCodingPkg;

public class PrintPatternofIntegers {
	public static void main(String[] args) {
		int start =0, gap = 5;
		if(start>=0)
		System.out.print(start + "  ");
		printPattern(start, start - gap, gap, true);	

	}

	public static int printPattern(int start, int current, int gap, boolean flag) {
		
		if (current < 0)
			flag = false;
		if (current == Math.abs(start)) {
			System.out.print(current + "  ");
			return current;
		}
		if (flag) {
			System.out.print(current + "  ");
			current = current - gap;
			return printPattern(start, current, gap, flag);
		} else {
			if (current>=(gap-gap*2)) {
				System.out.print(current + "  ");
			}
			current = current + gap;
			return printPattern(start, current, gap, flag);
		}
	}
}
