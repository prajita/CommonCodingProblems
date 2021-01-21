package commonCodingPkg;

public class CountNumberOfSubstringInString {

	public static void main(String[] args) {
		String str="MANABANMANYMANG";
		String substr="MAN";

		System.out.println(count(str, substr));
	}

	private static int count(String str, String substr) {
		int M=str.length();
		int N=substr.length();
		int count=0,j=0;
		
		for(int i=0;i<=M-N;i++) {
			for( j=0;j<N;j++) {
				if(str.charAt(i+j)!=substr.charAt(j)) {
					break;
				}
			}
			if(j==N) {
				count++;
				j=0;
			}
		}
		return count;
	}
}
