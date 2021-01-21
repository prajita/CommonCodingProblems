package commonCodingPkg;

public class CheckIfAStringIsSubstringOfAnother {
	public static void main(String args[]) {
		String a = "AAPRAJITAS";
		String b = "PRAJITA";
		System.out.println(checkSubstr(a, b));
	}

//	private static boolean checkSubstr(String a, String b) {
//		int M = a.length();
//		int N = b.length();
//		int i=0, j=0;
//
//		while(i<M && j<N) {
//			if(a.charAt(i)==b.charAt(j)) {
//				i++;
//				j++;
//				if(j==N) {
//					return true;
//				}
//			}else {
//				i++;
//				j=0;
//			}
//		}
//		return false;
//	}

	private static int[] checkSubstr(String a, String b) {
		int[] arr = new int[2];
		arr[0] = -1;
		arr[1] = -1;
		int M = a.length();
		int N = b.length();
		int i = 0, j = 0;

		while (i < M && j < N) {
			if (a.charAt(i) == b.charAt(j)) {
				i++;
				j++;
				if (j == N) {
					arr[0] = i - j;
					arr[1] = i;
				}
			} else {
				i++;
				j = 0;
			}
		}
		System.out.println(arr[0] + "   " + arr[1]);
		return arr;
	}

}
