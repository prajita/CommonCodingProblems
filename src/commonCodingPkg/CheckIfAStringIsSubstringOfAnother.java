package commonCodingPkg;

public class CheckIfAStringIsSubstringOfAnother {
	public static void main(String args[]) {
		String a = "PRAJITA";
		String b = "PRAJITAS";
		System.out.println(checkSubstr(a, b));
	}

	private static boolean checkSubstr(String a, String b) {
		int M = a.length();
		int N = b.length();
		int i=0, j=0;

		while(i<M && j<N) {
			if(a.charAt(i)==b.charAt(j)) {
				i++;
				j++;
				if(j==N) {
					return true;
				}
			}else {
				i++;
				j=0;
			}
		}
		return false;
	}
}
