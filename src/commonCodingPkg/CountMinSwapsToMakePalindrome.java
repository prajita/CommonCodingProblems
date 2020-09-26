package commonCodingPkg;
//not working
public class CountMinSwapsToMakePalindrome {
	public static void main(String[] args) {
		String str = "abcab";

		System.out.println("final count:: "+countSwaps(str));

	}

	private static int countSwaps(String str) {
		int count=0;
		
		StringBuilder rev= new StringBuilder();
		rev=rev.append(str).reverse();
		System.out.println("reverse::"+rev);
		if(str.equals(rev))return 0;
		
		char[] chararr= str.toCharArray();
		int n =str.length();
		for(int i=0;i<n;i++) {
			if(chararr[i]!=chararr[n-i-1]) {
				str=swap(str, n-i-2, n-i-1);
				count++;
			}
		}
		
		
	
		return count==0 ? -1 : count;
	}

	private static String swap(String str, int i, int j) {
		
		char[] chararr= str.toCharArray();
		char temp =chararr[i];
		chararr[i]=chararr[j];
		chararr[j]=temp;
		
		return chararr.toString();
	}

}
