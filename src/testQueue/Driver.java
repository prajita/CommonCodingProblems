package testQueue;

public class Driver {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(65);
		q.enqueue(0);
		q.enqueue(7);
		System.out.println("after first delete");
		q.show();
	}
}
