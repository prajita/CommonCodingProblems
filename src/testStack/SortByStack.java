package testStack;

import java.util.Stack;

public class SortByStack {
	public static Stack<Integer> callSort(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!input.isEmpty()) {
			int item=input.pop();
			while(!tempStack.isEmpty() && tempStack.peek()>item) {
				input.push(tempStack.pop());
			}
			tempStack.push(item);
			
		}	
		return tempStack;
	}

	public static void main(String args[]) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(1);
		s1.push(4);
		s1.push(45);
		s1.push(76);
		s1.push(32);
		s1.push(8);
		s1.push(11);
		Stack<Integer> temp = callSort(s1);
		temp.stream().forEach(System.out::println);
	}
}
