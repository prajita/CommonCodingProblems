package commonCodingPkg;

public class FreqOfSubstrInString {
	public static void main(String[] args) {
		String str = "MANDATORYMANHOLESMANTYMAGHGMAN";
		System.out.println(freqofSubstr(str, "MAN"));
	}

	private static int freqofSubstr(String str, String pattern) {
		int M=str.length();
		int N=pattern.length();
		int count=0, j=0;
		
		for(int i=0;i<=M-N;i++) {
			for(j=0;j<N;j++) {
				if(str.charAt(i+j)!=pattern.charAt(j)) {
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
