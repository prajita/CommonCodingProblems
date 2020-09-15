package commonCodingPkg;

public class DivisibleBy3ByBit {
	
	public static boolean checkDivisibility(int n) {
		int even=0,odd=0;
		if(n==0) return true;
		if(n==1) return false;
		 if (n < 0) n = -n; 
		while(n!=0) {
			
			if((n&1)!=0) {
				odd++;
			}
			if((n&2)!=0) {
				even++;
			}
			n>>=2;
		}
		return checkDivisibility(Math.abs(odd-even));
	
		
	}
public static void main(String[] args) {
	System.out.println(checkDivisibility(9));
	
}
}
