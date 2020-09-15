package testQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueues{
	static Queue<Integer> q1 = new LinkedList<Integer>(); 
    static Queue<Integer> q2 = new LinkedList<Integer>();  

	public void push(int data) {		
		if(q1.isEmpty()) {
			q2.add(data);
		}else {
			q1.add(data);

		}
	}
	public int pop() {
		if(q2.size()==0) {
			while(1<q1.size()) {
				q2.add(q1.poll());
			}
			return (int)q1.poll();
		}else {
			while(1<q2.size()) {
				q1.add(q2.poll());
			}
			return (int)q2.poll();
		}
		
	}
public static void main(String[] args) {
	StackWithQueues t = new StackWithQueues();
	t.push(12);
	t.push(1);
	t.push(4);
	System.out.println("pop 1st::"+t.pop());
	t.push(9);
	System.out.println("pop 2nd::"+t.pop());
	System.out.println("pop 2nd::"+t.pop());

	
	}
}
