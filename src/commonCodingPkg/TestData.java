package commonCodingPkg;

public class TestData {
	int data=50;
	public void change(TestData t){
		t.data=t.data+100;
	}
	public static void main(String args[]) {
		TestData t = new TestData();
		t.change(t);
		System.out.println(t.data);
	}
}
