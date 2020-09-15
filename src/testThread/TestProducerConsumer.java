package testThread;

class Q {
	int num = 0;
	Boolean flag = false;

	public synchronized void put(int num) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("put num::" + this.num);
		flag = true;
		notify();
	}
	

	public synchronized void get() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("get num::" + num);
		flag = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TestProducerConsumer {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
