package commonCodingPkg;

interface A {
	void show(int i);
}

//class X implements A {
//	public void show() {
//		System.out.println("inside new class");
//	}
//}

public class LambdaDemo {
	public static void main(String[] args) {
//		A test = new A(){
//			public void show() {
//				System.out.println("inside new class");
//			}
//		};
		A test = (i)->{
			
				System.out.println("inside new class"+i);
			
		};
		test.show(4);
		
		
	}

}
