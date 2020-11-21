package commonCodingPkg;

public class RemoveCharWithIndexFromString {
	public static void main(String args[]) {
		String a = "RJTASINHKLZZ";
		String b = "PRAJITASINHA";
		
		removeChar(a, 2);
	}
	private static void removeChar(String str, int pos) {
		
		StringBuilder sb=new StringBuilder(str);
		sb.deleteCharAt(pos);
		System.out.println(sb);
		
		
		
		String res=str.substring(0, pos)+str.substring(pos+1, str.length());
		System.out.println(res);

	}
}
