package commonCodingPkg;

public class CheckIfConsecutiveSetBitsIncreasing {
	
	public static boolean testIfConsecutiveSetBitsIncreasing(int n) {
		int prevCount=Integer.MAX_VALUE;
	while(n>0) {
		int count=1;	
		while(n>0 && n%2==0) {
			n=n/2;
		}
		
		while(n>0 && n%2==1) {
			n=n/2;
			count++;
		}
		if(count>=prevCount) {
			return false;
		}
		prevCount=count;
	}
	return true;
	}
public static void main(String args[]) {	
	
	System.out.println(testIfConsecutiveSetBitsIncreasing(19));
	
}
}
