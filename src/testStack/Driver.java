package testStack;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Dstack mystack=new Dstack();
		
//		for(int i=0;i<size;i++ ){
//			Scanner scanner = new Scanner(System.in); 
//			System.out.println("enter the element to push in the stack::");
//			int input = scanner.nextInt();
//			mystack.push(input);
//			scanner.close();
//		}
		
		mystack.push(10);
		mystack.push(11);
		mystack.push(12);
		mystack.push(13);
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		mystack.push(14);
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		mystack.push(15);
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		mystack.push(16);
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		System.out.println("peek element::"+mystack.peek());
		int popped=mystack.pop();
		System.out.println("popped element::"+popped);		
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		System.out.println("the stack is empty ::"+mystack.isEmpty());
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.show();
		System.out.println("the current size is ::"+mystack.size());
		
		
	}
}
