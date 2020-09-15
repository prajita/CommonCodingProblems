package testThread;


	class Table {
		public void printTable(int m) {
			synchronized (this) {
				for (int i = 1; i < 5; i++) {
					System.out.println(m * i);
				}
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	class Thread1 extends Thread {

		Table t1;

		Thread1(Table t) {
			this.t1 = t;
		}

		public void run() {
			t1.printTable(5);
		}
	}

	class Thread2 extends Thread {

		Table t2;

		Thread2(Table t){this.t2=t;}

		public void run() {
			t2.printTable(6);
		}
	}
	public class TestSynchronized {
	public static void main(String[] args) {
		Table t= new Table();
		Thread1 t1= new Thread1(t);
		Thread2 t2= new Thread2(t);
		
		t1.start();
		t2.start();
		
	}

}
