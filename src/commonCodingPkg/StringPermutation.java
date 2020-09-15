package commonCodingPkg;

public class StringPermutation {

	
	public static void main(String ... args) {
		
		String str = "ABCD";
		permutation(str, 0);
		
	}

	private static void permutation(String str, int fixed) {

		int length = str.length();
		if(fixed==length-1) {
			System.out.println(str);
		}else {
			for(int i=fixed;i<str.length();i++) {
				str = swap(str, i, fixed);
				permutation(str, fixed+1);
			}
		}
	}

	private static String swap(String str, int i, int fixed) {
		char[] charset= str.toCharArray();
		char temp = charset[i];
		charset[i] = charset[fixed];
		charset[fixed]=temp;
		
		
		return String.valueOf(charset);
	}
}
