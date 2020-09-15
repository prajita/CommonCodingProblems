package testStack;

import java.util.Scanner;

public class Dstack {
	int top = 0;
	int capacity = 2;
	int stack[] = new int[capacity];

	public void push(int data) {
		if (isFull()) {
			expand();
		}
		stack[top] = data;
		top++;

	}

	public int pop() {
		int data=0;
		if (isEmpty()) {
			System.out
					.println("pop operation not possible..no element is the stack");
			
		} else {
			data = stack[top - 1];
			top--;
			stack[top] = 0;
			shrink();
		}
		return data;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
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

	public boolean isFull() {
		return top == capacity;
	}

	public void expand() {
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
	}
	public void shrink(){
		int length=size();
		if(length<=(capacity/2)/2){
			capacity/=2;
		}
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
	}

}
