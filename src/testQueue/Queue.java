package testQueue;

public class Queue {
	int queue[] = new int[6];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) throws IllegalStateException{
		if(isOverflow()) {
			throw new IllegalStateException("illegal state:: queue full");
		}
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
	}
	public int dequeue() throws IllegalStateException{
		if(isEmpty()) {
			throw new IllegalStateException("illegal state:: queue empty");
		}
		int data=queue[front];
		front=(front+1)%5;
		size--;
		return data;
	}
	public void show(){
		for(int i=0;i<size;i++){
			System.out.println(queue[(front+i)%5]+" ");
		}
		
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isOverflow() {
		return size==5;
	}
}

