package commonCodingPkg;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str="abcba";
		System.out.println(isPalindrome(str));

	}
	 public static boolean isPalindrome(String s) {
	        int left=0;
	        s = s.replaceAll("[^a-zA-Z0-9]", "");
	        s=s.toUpperCase();
	        int right=s.length()-1;
	        while(left<right){
	            if(s.charAt(left)!=s.charAt(right)){
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
}
