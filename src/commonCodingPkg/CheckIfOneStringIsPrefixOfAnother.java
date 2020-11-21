package commonCodingPkg;

public class CheckIfOneStringIsPrefixOfAnother {
	public static void main(String args[]) {
		String a = "PRAJITASINHA";
		String b = "PRAJITA";
		
		System.out.println(checkPrefix(a, b));
	}
	private static boolean checkPrefix(String a, String b) {
		int M = a.length();
		int N = b.length();
		
		
		for(int i=0;i<M && i<N;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				continue;
			}else {
				return false;
			}
		}
		
		if(M==N)System.out.println("both are same");
		else if (M<N)System.out.println("a is prefix of b");
		else System.out.println("b is prefix of a");
		return true;
		
	}
}
