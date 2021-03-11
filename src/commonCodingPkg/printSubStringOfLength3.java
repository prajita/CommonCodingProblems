package commonCodingPkg;

public class printSubStringOfLength3 {
public static void main(String args[]) {
	callUtil("ASDFGH");
}

private static void callUtil(String string) {

	
	for(int i=0;i<string.length()-2;i++) {
		System.out.println(string.substring(i,i+3));
	}
}
}
