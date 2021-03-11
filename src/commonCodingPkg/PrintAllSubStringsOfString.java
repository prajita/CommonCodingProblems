package commonCodingPkg;

public class PrintAllSubStringsOfString {
	public static void main(String args[]) {
		String str = "abcd";
		printAllSubString(str);

	}

	

	private static void printAllSubString(String str) {
		int n=str.length();
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.println(str.substring(j, i));
			}
		}
		System.out.println();
	}
	
	
	
}
