package testQueue;
import java.util.Stack;
public class QueueOperationsWithStack{
public static class Queue  {
	
	static Stack<Integer> s1= new Stack<Integer>();
	static Stack<Integer> s2= new Stack<Integer>();
	public static void enQueueOperation(int x) {
		
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			s1.add(x);		
			while(!s2.isEmpty()) {
				s1.add(s2.pop());
			}
		
	}
	public static int deQueueOperation() {
		if(!s1.isEmpty()) {
			return s1.pop();
		}else {
			return s2.pop();
		}
	}
	public static void main(String[] args) {
		
		
		enQueueOperation(2);
		enQueueOperation(3);
		enQueueOperation(4);
		enQueueOperation(5);
		enQueueOperation(6);
		enQueueOperation(7);
		System.out.println(deQueueOperation());
		System.out.println(deQueueOperation());
		System.out.println(deQueueOperation());
		
	}
}
}