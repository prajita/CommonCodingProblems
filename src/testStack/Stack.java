package testStack;

import java.util.Scanner;

public class Stack {
	int sizeOfStack = 0;
	int top = 0;
	int stack[];

	public void push(int data) {
		if (isFull()) {
			System.out.println("push operation not possible.. the stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	} 

	public int pop() {
		if (isEmpty()) {
			System.out.println("pop operation not possible..no element is the stack");
			return -1;
		} else {
			int data;
			data = stack[top - 1];
			top--;
			stack[top] = 0;
			return data;
		}

	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public void setSize(int n) {
		this.sizeOfStack = n;
		stack = new int[n];
	}

	public int getSizeOfStack() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of elements in the stack::");
		int input = scanner.nextInt();
		this.setSize(input);
		scanner.close();
		return input;
	}

	public void show() {
		for (int n : stack) {
			System.out.println(n + " ");
		}
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public boolean isFull(){
		return top==this.sizeOfStack;
	}
}
