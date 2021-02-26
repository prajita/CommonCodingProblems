package commonCodingPkg;

import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String[] args) {

		String S = "a#c";
		String T = "b##c";
		System.out.println(callutil(S, T));
	}

	private static boolean callutil(String S, String T) {

		Stack<Character> stack1 = new Stack<Character>();

		for (char c : S.toCharArray()) {
			if (c != '#') {
				stack1.push(c);
			} else if(!stack1.isEmpty()){
				stack1.pop();
			}

		}
		
		Stack<Character> stack2 = new Stack<Character>();

		for (char c : T.toCharArray()) {
			if (c != '#') {
				stack2.push(c);
			} else if(!stack2.isEmpty()){
				stack2.pop();
			}

		}
		
		while(!stack1.isEmpty()) {
			
			char curr=stack1.pop();
			if(stack2.isEmpty() || curr!=stack2.pop()) {
				return false;
			}
		}
		return true;
	}

}