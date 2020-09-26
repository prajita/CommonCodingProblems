package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SortAStack {

	Stack<Integer> outputStack = new Stack<Integer>();

	public void sortStack(Stack<Integer> input) {
		while (input.size() != 0) {

			int temp = input.pop();
			while (outputStack.size() != 0 && outputStack.peek() > temp) {
				input.push(outputStack.pop());
			}
			outputStack.push(temp);

		}
		System.out.println(outputStack);
	}

	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(90);
		s.push(4);
		s.push(1);
		s.push(8);
		s.push(45);
		s.push(50);
		s.push(18);
		new SortAStack().sortStack(s);
		List<String> list1 = new ArrayList<>();
		list1.add("foo");

		List<String> list2 = list1;

		List<String> list3 = new ArrayList<>(list2);

		list1.clear();
		list2.add("bar");
		list3.add("bar2");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

	}
}
